package me.zhengjie.modules.wechat.service;

import com.lly835.bestpay.model.PayResponse;
import me.zhengjie.modules.wechat.entity.ServiceInfo;
import org.springframework.http.ResponseEntity;

public interface PayService {
    ResponseEntity create(ServiceInfo serviceInfo);

    PayResponse notify(String notifyData);
}
