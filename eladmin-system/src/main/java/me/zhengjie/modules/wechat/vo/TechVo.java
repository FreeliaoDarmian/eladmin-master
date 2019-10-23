package me.zhengjie.modules.wechat.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class TechVo {
    private String status;

    private String workerNo;

    private Byte orderNum;

    private Byte completeNum;

    private Date lastOrderTime;

    private String phoneNum;

    private String headImageUrl;

    private String name;

    private Boolean sex;


}
