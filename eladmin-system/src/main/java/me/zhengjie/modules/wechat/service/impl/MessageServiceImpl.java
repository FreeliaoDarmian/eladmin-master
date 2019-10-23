package me.zhengjie.modules.wechat.service.impl;

import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import me.zhengjie.modules.wechat.config.WechatAccountConfig;
import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {
    @Autowired
    private WxMpService wxMpService;

    @Autowired
    private WechatAccountConfig accountConfig;

    @Override
    public ResponseEntity send(ServiceInfo serviceInfo) {
        WxMpTemplateMessage templateMessage = new WxMpTemplateMessage();
        templateMessage.setTemplateId("yPGlgleJRYl2yLcl-cpeepFR1_EtY-ACnVacUw36uzU");
        templateMessage.setToUser("oxXWdwk8pp-DJJ-ymdNsRyknpBr4");

        //数据
        List<WxMpTemplateData> data = Arrays.asList(
                new WxMpTemplateData("first", "您有新的的维修订单"),
                new WxMpTemplateData("keyword1", "商品维修"),
                new WxMpTemplateData("keyword2", serviceInfo.getUserName()),
                new WxMpTemplateData("keyword3", serviceInfo.getUserPhone()),
                new WxMpTemplateData("keyword4", serviceInfo.getServiceId()),
                new WxMpTemplateData("keyword5", serviceInfo.getFaultDescription()),
                new WxMpTemplateData("keyword6",serviceInfo.getProductModel()),
                new WxMpTemplateData("keyword7",serviceInfo.getRequireTime()),
                new WxMpTemplateData("remark", "欢迎再次光临！")
        );
        templateMessage.setData(data);
        try {
            wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
            return new ResponseEntity(HttpStatus.OK);
        }catch (WxErrorException e) {
            log.error("【微信模版消息】发送失败, {}", e);
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
