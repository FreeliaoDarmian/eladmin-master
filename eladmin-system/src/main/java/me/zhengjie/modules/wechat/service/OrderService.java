package me.zhengjie.modules.wechat.service;

import me.zhengjie.modules.wechat.entity.ServiceInfo;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    ResponseEntity cancelService(String orderId,Long adminId);

    ResponseEntity completeOrder(String serviceId, Long adminId, String remarkId);

    ResponseEntity listOrder(String limit, String offset,Long adminId);

    ResponseEntity dispatchOrder(String serviceId, Long adminId,Long userId);

    ServiceInfo findOne(String serviceId);

    ResponseEntity paid(ServiceInfo serviceInfo);

    ResponseEntity details(String serviceId,Long adminId);

    ResponseEntity listUserOrder(String openId, Integer limit, Integer offset);

    ResponseEntity userCancelService(String orderId);
}
