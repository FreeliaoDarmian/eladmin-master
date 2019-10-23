package me.zhengjie.modules.wechat.utils;

import com.alibaba.fastjson.JSONObject;
import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.entity.ServicePic;
import me.zhengjie.modules.wechat.form.OrderFrom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class OrderFrom2ServiceInfoConverter {

    public static ServiceInfo converter(OrderFrom orderFrom){
        ServiceInfo serviceInfo=new ServiceInfo();
        serviceInfo.setUserPhone(orderFrom.getPhone());
        serviceInfo.setUserAddress(orderFrom.getAddress());
        serviceInfo.setFaultDescription(orderFrom.getFault_description());
        serviceInfo.setRequireTime(orderFrom.getOrderTime());
        serviceInfo.setWxOpenid(orderFrom.getOpenid());
        serviceInfo.setProductId(orderFrom.getProductId());
        serviceInfo.setProductNum(orderFrom.getNum());
        List<ServicePic> servicePicList = JSONObject.parseArray(orderFrom.getServerPics(), ServicePic.class);
        return serviceInfo;
    }

}
