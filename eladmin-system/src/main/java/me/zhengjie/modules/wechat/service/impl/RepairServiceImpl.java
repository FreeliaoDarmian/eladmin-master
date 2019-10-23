package me.zhengjie.modules.wechat.service.impl;

import me.zhengjie.modules.wechat.entity.*;
import me.zhengjie.modules.wechat.repository.*;
import me.zhengjie.modules.wechat.service.MessageService;
import me.zhengjie.modules.wechat.service.RepairService;
import me.zhengjie.modules.wechat.utils.KeyUtil;
import me.zhengjie.modules.wechat.vo.AddressVo;
import me.zhengjie.modules.wechat.vo.ProducPartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    MessageService messageService;
    @Autowired
    WechatUserMapper wechatUserMapper;

    @Autowired
    ProductBrandMapper productBrandMapper;

    @Autowired
    ProductClassMapper productClassMapper;

    @Autowired
    ProductModelMapper productModelMapper;

    @Autowired
    ServiceInfoMapper serviceInfoMapper;

    @Autowired
    ServicePicMapper servicePicMapper;


    @Transactional
    @Override
    public ResponseEntity repair(ServiceInfo serviceInfo) {
        String serviceId= KeyUtil.genUniqueKey();
        //1:查找商品模型
        ProductModel productModel=productModelMapper.selectByPrimaryKey(Integer.valueOf(serviceInfo.getProductId()));
        ProductBrand productBrand=productBrandMapper.selectByPrimaryKey(productModel.getBrandId());
        ProductClass productClass=productClassMapper.selectByPrimaryKey(productBrand.getClassId());
        WechatUserExample wechatUserExample=new WechatUserExample();
        //2.查找用户信息
        wechatUserExample.createCriteria().andOpenIdEqualTo(serviceInfo.getWxOpenid());
        WechatUser wechatUser=wechatUserMapper.selectByExample(wechatUserExample).get(0);
        serviceInfo.setBookinTime(new Date());
        serviceInfo.setProductBrand(productBrand.getBrandName());
        serviceInfo.setProductName(productModel.getModelName());
        serviceInfo.setProductModel(productClass.getClassName());
        serviceInfo.setUserName(wechatUser.getNickName());
        serviceInfo.setIsDispatch(false);
        serviceInfo.setServiceId(serviceId);
        serviceInfo.setPayStatus(new Long(0));
        //计算费用

        //持久化
       int insert= serviceInfoMapper.insertSelective(serviceInfo);
        for(ServicePic s:serviceInfo.getServicePicList()){
            s.setServiceId(serviceId);
            servicePicMapper.insert(s);
        }
        //发送公众号消息
        messageService.send(serviceInfo);
        return insert>0?new ResponseEntity(serviceId,HttpStatus.OK):new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity selectPart(Integer limit, Integer offset) {
        List<ProducPartVo> result=new ArrayList<>();
        ProductBrandExample productBrandExample=new ProductBrandExample();
        String pageSize=String.valueOf(limit);
        String pageNum=String.valueOf(offset);
        productBrandExample.setOrderByClause("brand_id limit "+pageSize+","+pageNum);
        productBrandExample.createCriteria().andClassIdEqualTo(2);
        List<ProductBrand> productBrands = productBrandMapper.selectByExample(productBrandExample);
        productBrands.forEach(
                productBrand -> {
                    ProductModelExample productModelExample=new ProductModelExample();
                    productModelExample.createCriteria().andBrandIdEqualTo(productBrand.getBrandId());
                    List<ProductModel> productModels = productModelMapper.selectByExample(productModelExample);
                    productModels.forEach(
                            productModel -> {
                                ProducPartVo producPartVo=new ProducPartVo();
                                producPartVo.setBrandName(productBrand.getBrandName());
                                producPartVo.setSmmary(productModel.getModelName());
                                producPartVo.setAccountPrice(productModel.getAccountPrice());
                                result.add(producPartVo);
                            }
                    );
                }
        );
        return result.size()>0?new ResponseEntity(result,HttpStatus.OK):new ResponseEntity(HttpStatus.NOT_FOUND);
    }

}
