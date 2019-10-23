package me.zhengjie.modules.wechat.entity;

public class ServicePic {
    private Long servicePicId;

    private String serviceId;

    private String picPath;

    public Long getServicePicId() {
        return servicePicId;
    }

    public void setServicePicId(Long servicePicId) {
        this.servicePicId = servicePicId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}