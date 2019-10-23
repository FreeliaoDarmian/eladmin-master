package me.zhengjie.modules.wechat.vo;

import lombok.Data;
import me.zhengjie.modules.wechat.vo.WxError;

import java.util.List;
@Data
public class WxBaseUserInfo extends WxError {

    private String openid;

    private String nickname;

    private Integer sex;

    private String province;

    private String city;

    private String country;

    private String headimgurl;

    //private List<String> privilege;// tag8

    private String unionid;

    // getter and setter...

    @Override
    public String toString() {
        return "WxBaseUserInfo{" +
                "openid='" + openid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", sex=" + sex +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", headimgurl='" + headimgurl + '\'' +
                ", unionid='" + unionid + '\'' +
                '}' + "  " + super.toString();
    }
}