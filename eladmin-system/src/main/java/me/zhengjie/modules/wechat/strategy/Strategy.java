package me.zhengjie.modules.wechat.strategy;

public interface Strategy {
    <T> T doOperation(String openId,Integer limit,Integer offset);
}
