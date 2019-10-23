package me.zhengjie.modules.wechat.vo;

import lombok.Data;

@Data
public class WiselyResponse {
    private String responseMessage;

    public WiselyResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }
}
