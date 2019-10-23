package me.zhengjie.modules.wechat.vo;

public class WxError {

    private Integer errcode;

    private String errmsg;

    // getter and setter...

    @Override
    public String toString() {
        return "WxError{" +
                "errcode=" + errcode +
                ", errmsg='" + errmsg + '\'' +
                '}';
    }

    //---------- functions

    public boolean valid(){
        return errcode == null || errcode == 0;
    }
}
