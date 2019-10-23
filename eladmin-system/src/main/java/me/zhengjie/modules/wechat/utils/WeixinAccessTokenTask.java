package me.zhengjie.modules.wechat.utils;

import me.zhengjie.modules.wechat.vo.WeixinConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeixinAccessTokenTask {
    Logger logger = LoggerFactory.getLogger(WeixinAccessTokenTask.class);

    @Autowired
    private WeixinCommenUtil weixinCommenUtil;

    // 第一次延迟1秒执行，当执行完后7100秒再执行
    //@Scheduled(initialDelay = 1000, fixedDelay = 70 * 1000)
    public String getWeixinAccessToken(String code) {
        String token=null;
        try {
            token = weixinCommenUtil.getToken(WeixinConstants.APPID, WeixinConstants.APPSECRET,code).getAccess_token();
            logger.info("获取到的微信access_token为" + token);
        } catch (Exception e) {
            logger.error("获取微信access_toke出错，信息如下");
            e.printStackTrace();
            this.getWeixinAccessToken(code);
        }
        return token;
    }
}