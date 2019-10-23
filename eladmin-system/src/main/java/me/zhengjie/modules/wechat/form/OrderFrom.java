package me.zhengjie.modules.wechat.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
public class OrderFrom {

    /**
     * 商品id
     */
    @NotBlank(message = "商品id不能为空")
    private String productId;

    /**
     * 商品数量
     */
    @NotNull(message = "商品数量不能为空")
    private Short num;

    /**
     * 买家手机号
     */
    @NotBlank(message="手机号不能为空")
    private String phone;

    /**
     * 买家地址
     */
    @NotBlank(message="地址不能为空")
    private String address;

    /**
     * 买家微信openid
     */
    @NotBlank(message="openid不能为空")
    private String openid;

    /**
     * 问题描述
     */
    @NotBlank(message="问题描述不能为空")
    private String fault_description;

    /**
     * 图片url
     */
    private String serverPics;

    /**
     * 预定时间
     */
    @NotBlank(message="时间不能为空")
    private String orderTime;

}
