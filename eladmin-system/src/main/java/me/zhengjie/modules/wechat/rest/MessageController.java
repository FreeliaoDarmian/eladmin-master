package me.zhengjie.modules.wechat.rest;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.zhengjie.modules.wechat.config.WechatAccountConfig;
import me.zhengjie.modules.wechat.enums.ResultEnum;
import me.zhengjie.modules.wechat.exception.SellException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequestMapping("/ws")
@RestController
@Slf4j
public class MessageController {

    @Autowired
    private WxMpService wxMpService;

    @Autowired
    private WechatAccountConfig wechatAccountConfig;

    //服务器推送消息
    @PostMapping("/check")
    public void check(ServletResponse response, String timestamp, String nonce, String signature, String echostr) {
        if (!wxMpService.checkSignature(timestamp, nonce, signature)) {
            log.error("不合法");
            throw new SellException(ResultEnum.WECHAT_MP_ERROR);
        }
        PrintWriter o = null;
        try {
            o = new PrintWriter(response.getWriter());
            o.print(echostr);
        } catch (IOException e) {
            log.error("写回微信端错误{}", e.getMessage());
        } finally {
            o.close();
        }
    }






}
