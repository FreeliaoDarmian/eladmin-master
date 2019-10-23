package me.zhengjie.modules.wechat.enums;

import lombok.Getter;

@Getter
public enum ProgressStatus {

    UNACHEIVE(1,"未处理"),
    UNDISPATCHER(2,"未派工"),
    UNCOMPLETE(3,"待维修"),
    COMPLETE(4,"完成");

    private int code;

    private String value;

    ProgressStatus(int code,String value){
        this.code=code;
        this.value=value;
    }


}
