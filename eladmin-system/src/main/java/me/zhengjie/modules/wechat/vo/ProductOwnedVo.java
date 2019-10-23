package me.zhengjie.modules.wechat.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ProductOwnedVo extends ProductVo {
    private List<String> imgUrl;
    private String userOwnedAddress;
    private Byte userOwnedIntime;
    private Date userOwnedOrderTime;
}
