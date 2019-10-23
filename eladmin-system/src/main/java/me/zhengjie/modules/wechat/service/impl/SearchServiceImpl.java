package me.zhengjie.modules.wechat.service.impl;

import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.entity.ServiceProgress;
import me.zhengjie.modules.wechat.enums.ResultEnum;
import me.zhengjie.modules.wechat.exception.SellException;
import me.zhengjie.modules.wechat.repository.ServiceInfoMapper;
import me.zhengjie.modules.wechat.repository.ServiceProgressMapper;
import me.zhengjie.modules.wechat.service.SearchService;
import me.zhengjie.modules.wechat.vo.QuerryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    ServiceInfoMapper serviceInfoMapper;

    @Autowired
    ServiceProgressMapper serviceProgressMapper;


    @Override
    public ResponseEntity search(QuerryData querryData) {
        Optional.ofNullable(querryData).orElseThrow(()-> new SellException(ResultEnum.PARAM_ERROR));
       /*if(querryData == null){
           System.out.println("111");
           throw new SellException(ResultEnum.PARAM_ERROR);
       }*/
        System.out.println(querryData.toString()+querryData.hashCode());
        List<ServiceInfo> serviceInfos = serviceInfoMapper.selectByQuerryDate(querryData);
        serviceInfos.forEach(serviceInfo -> {
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
        return new ResponseEntity(serviceInfos, HttpStatus.OK);
    }
}
