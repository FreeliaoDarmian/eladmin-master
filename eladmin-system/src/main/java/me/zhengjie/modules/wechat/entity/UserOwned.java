package me.zhengjie.modules.wechat.entity;

import java.util.Date;

public class UserOwned {
    private Integer userOwnedId;

    private Long userId;

    private Integer productId;

    private String userOwnedAddress;

    private Byte userOwnedIntime;

    private Date userOwnedOrderTime;

    public Integer getUserOwnedId() {
        return userOwnedId;
    }

    public void setUserOwnedId(Integer userOwnedId) {
        this.userOwnedId = userOwnedId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getUserOwnedAddress() {
        return userOwnedAddress;
    }

    public void setUserOwnedAddress(String userOwnedAddress) {
        this.userOwnedAddress = userOwnedAddress == null ? null : userOwnedAddress.trim();
    }

    public Byte getUserOwnedIntime() {
        return userOwnedIntime;
    }

    public void setUserOwnedIntime(Byte userOwnedIntime) {
        this.userOwnedIntime = userOwnedIntime;
    }

    public Date getUserOwnedOrderTime() {
        return userOwnedOrderTime;
    }

    public void setUserOwnedOrderTime(Date userOwnedOrderTime) {
        this.userOwnedOrderTime = userOwnedOrderTime;
    }
}