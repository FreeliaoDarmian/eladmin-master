package me.zhengjie.modules.wechat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class ServiceInfo {
    private String serviceId;

    @JsonIgnore
    private String productId;

    private String serviceName;

    private String userName;

    private String userAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userPhone;

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productBrand;

    private String productModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Short productNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String faultDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date saleTime;

    private Date bookinTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String wxOpenid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String requireTime;

    private Boolean isDispatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long dispatcher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date dispatchTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long processor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal fees;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String callbackInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String serviceMemo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long payStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ServicePic> servicePicList;

    private String progressState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long progressUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date progressTime;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel == null ? null : productModel.trim();
    }

    public Short getProductNum() {
        return productNum;
    }

    public void setProductNum(Short productNum) {
        this.productNum = productNum;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription == null ? null : faultDescription.trim();
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Date getBookinTime() {
        return bookinTime;
    }

    public void setBookinTime(Date bookinTime) {
        this.bookinTime = bookinTime;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getRequireTime() {
        return requireTime;
    }

    public void setRequireTime(String requireTime) {
        this.requireTime = requireTime == null ? null : requireTime.trim();
    }

    public Boolean getIsDispatch() {
        return isDispatch;
    }

    public void setIsDispatch(Boolean isDispatch) {
        this.isDispatch = isDispatch;
    }

    public Long getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Long dispatcher) {
        this.dispatcher = dispatcher;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Long getProcessor() {
        return processor;
    }

    public void setProcessor(Long processor) {
        this.processor = processor;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public String getCallbackInfo() {
        return callbackInfo;
    }

    public void setCallbackInfo(String callbackInfo) {
        this.callbackInfo = callbackInfo == null ? null : callbackInfo.trim();
    }

    public String getServiceMemo() {
        return serviceMemo;
    }

    public void setServiceMemo(String serviceMemo) {
        this.serviceMemo = serviceMemo == null ? null : serviceMemo.trim();
    }

    public Long getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }

}