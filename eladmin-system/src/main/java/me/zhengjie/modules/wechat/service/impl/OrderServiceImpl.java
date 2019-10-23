package me.zhengjie.modules.wechat.service.impl;

import me.zhengjie.modules.wechat.entity.*;
import me.zhengjie.modules.wechat.repository.ServiceInfoMapper;
import me.zhengjie.modules.wechat.repository.ServicePicMapper;
import me.zhengjie.modules.wechat.repository.ServiceProgressMapper;
import me.zhengjie.modules.wechat.service.MessageService;
import me.zhengjie.modules.wechat.service.OrderService;
import me.zhengjie.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    ServiceProgressMapper serviceProgressMapper;

    @Autowired
    ServiceInfoMapper serviceInfoMapper;


    @Autowired
    ServicePicMapper servicePicMapper;

    @Autowired
    MessageService messageService;


    @Override
    public ResponseEntity cancelService(String orderId,Long adminId) {
        ServiceProgressExample serviceProgressExample=new ServiceProgressExample();
        serviceProgressExample.createCriteria().andServiceIdEqualTo(orderId);
        ServiceProgress serviceProgress=serviceProgressMapper.selectByExample(serviceProgressExample).get(0);
        ServiceInfoExample example=new ServiceInfoExample();
        example.createCriteria().andDispatcherEqualTo(adminId).andServiceIdEqualTo(serviceProgress.getServiceId());
        ServiceInfo serviceInfo=serviceInfoMapper.selectByExample(example).get(0);
        serviceInfo.setDispatcher(adminId);
        serviceInfoMapper.updateByPrimaryKey(serviceInfo);
        serviceProgress.setProgressState("取消");
        serviceProgress.setProgressTime(new Date());
        serviceProgressMapper.updateByExample(serviceProgress,serviceProgressExample);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity completeOrder(String serviceId, Long adminId, String remarkId) {
        ServiceInfo serviceInfo=this.findOne(serviceId);
        serviceInfo.setProcessor(adminId);
        serviceInfo.setCallbackInfo(remarkId);
        ServiceInfoExample serviceInfoExample=new ServiceInfoExample();
        serviceInfoExample.createCriteria().andServiceIdEqualTo(serviceId);
        serviceInfoMapper.updateByExample(serviceInfo,serviceInfoExample);

        ServiceProgressExample serviceProgressExample=new ServiceProgressExample();
        serviceProgressExample.createCriteria().andServiceIdEqualTo(serviceId);
        ServiceProgress serviceProgress=serviceProgressMapper.selectByExample(serviceProgressExample).get(0);
        serviceProgress.setProgressState("已完成");
        serviceProgress.setProgressTime(new Date());
        serviceProgressMapper.updateByExample(serviceProgress,serviceProgressExample);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity listOrder(String limit, String offset,Long adminId) {
        ServiceInfoExample serviceInfoExample=new ServiceInfoExample();
        serviceInfoExample.setOrderByClause("service_id limit "+limit+","+offset);
        serviceInfoExample.createCriteria().andDispatcherEqualTo(adminId);
        List<ServiceInfo> serviceInfos = serviceInfoMapper.selectByExample(serviceInfoExample);
        serviceInfos.forEach(serviceInfo -> {
            ServiceProgressExample serviceProgressExample=new ServiceProgressExample();
            serviceProgressExample.createCriteria().andServiceIdEqualTo(serviceInfo.getServiceId());
            ServiceProgress serviceProgress=serviceProgressMapper.selectByExample(serviceProgressExample).get(0);
            serviceInfo.setProgressState(serviceProgress.getProgressState());
            serviceInfo.setPayStatus(null);
            serviceInfo.setCallbackInfo(null);
            serviceInfo.setProgressTime(null);
            serviceInfo.setFaultDescription(null);
            serviceInfo.setServiceMemo(null);
            serviceInfo.setSaleTime(null);
            serviceInfo.setFees(null);
            serviceInfo.setProductBrand(null);
            serviceInfo.setWxOpenid(null);
            serviceInfo.setProductNum(null);
            serviceInfo.setRequireTime(null);
            serviceInfo.setProcessor(null);
            serviceInfo.setDispatcher(null);
            serviceInfo.setDispatchTime(null);
            serviceInfo.setServicePicList(null);
        });
        return new ResponseEntity(serviceInfos,HttpStatus.OK);
    }

    @Override
    public ResponseEntity dispatchOrder(String serviceId, Long adminId,Long userId) {
        ServiceInfo serviceInfo=this.findOne(serviceId);
        serviceInfo.setProcessor(userId);
        serviceInfo.setIsDispatch(true);
        serviceInfo.setDispatchTime(new Date());
        serviceInfo.setDispatcher(adminId);
        ServiceInfoExample serviceInfoExample=new ServiceInfoExample();
        serviceInfoExample.createCriteria().andServiceIdEqualTo(serviceId);
        serviceInfoMapper.updateByExample(serviceInfo,serviceInfoExample);
        messageService.send(serviceInfo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ServiceInfo findOne(String serviceId) {
        return serviceInfoMapper.selectByPrimaryKey(serviceId);
    }

    @Override
    public ResponseEntity paid(ServiceInfo serviceInfo) {
        serviceInfoMapper.insert(serviceInfo);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity details(String serviceId,Long adminId) {
        ServiceInfo serviceInfo=serviceInfoMapper.selectByPrimaryKey(serviceId);
        ServicePicExample example=new ServicePicExample();
        example.createCriteria().andServiceIdEqualTo(serviceInfo.getServiceId());
        List<ServicePic> servicePicList=servicePicMapper.selectByExample(example);
        serviceInfo.setServicePicList(servicePicList);
        ServiceProgressExample serviceProgressExample=new ServiceProgressExample();
        serviceProgressExample.createCriteria().andServiceIdEqualTo(serviceId);
        ServiceProgress serviceProgress=serviceProgressMapper.selectByExample(serviceProgressExample).get(0);
        serviceInfo.setProgressState(serviceProgress.getProgressState());
        serviceInfo.setProgressTime(serviceProgress.getProgressTime());
        serviceInfo.setProgressUser(serviceProgress.getProgressUser());
        return new ResponseEntity(serviceInfo,HttpStatus.OK);
    }

    @Override
    public ResponseEntity listUserOrder(String openId, Integer limit, Integer offset) {
        ServiceInfoExample serviceInfoExample=new ServiceInfoExample();
        String pageNum=String.valueOf(limit);
        String pageSize=String.valueOf(offset);
        serviceInfoExample.setOrderByClause("service_id limit "+pageNum+","+pageSize);
        List<ServiceInfo> serviceInfos = serviceInfoMapper.selectByExample(serviceInfoExample);
        return new ResponseEntity(serviceInfos,HttpStatus.OK);
    }

    @Override
    public ResponseEntity userCancelService(String orderId) {
        ServiceProgressExample serviceProgressExample=new ServiceProgressExample();
        serviceProgressExample.createCriteria().andServiceIdEqualTo(orderId);
        ServiceProgress serviceProgress=serviceProgressMapper.selectByExample(serviceProgressExample).get(0);
        serviceProgress.setProgressState("取消");
        serviceProgressMapper.updateByExample(serviceProgress,serviceProgressExample);
        return new ResponseEntity(HttpStatus.OK);
    }
}
