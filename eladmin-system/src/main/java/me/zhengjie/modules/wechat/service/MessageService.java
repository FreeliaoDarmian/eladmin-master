package me.zhengjie.modules.wechat.service;


import me.zhengjie.modules.wechat.entity.ServiceInfo;
import org.springframework.http.ResponseEntity;

public interface MessageService {

    public ResponseEntity send(ServiceInfo serviceInfo);

}
