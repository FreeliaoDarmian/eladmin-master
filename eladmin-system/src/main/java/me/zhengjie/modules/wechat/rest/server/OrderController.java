package me.zhengjie.modules.wechat.rest.server;

import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.wechat.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//订单处理控制器
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    //取消订单
    @PostMapping("/cancelOrder")
    public ResponseEntity cancelOrder(String serviceId,@RequestAttribute Long adminId){
        log.info("当前登录的用户id为----"+adminId);
        return orderService.cancelService(serviceId,adminId);
    }
    //回访订单
    @PostMapping("/completeOrder/{serviceId}")
    public ResponseEntity completeOrder(@PathVariable(value = "serviceId") String serviceId,String remark,@RequestAttribute Long adminId){
       return orderService.completeOrder(serviceId,adminId,remark);

    }
    //查找所有订单
    @PostMapping("/listOrder")
    public ResponseEntity listOrder(@RequestParam(value = "limit", defaultValue = "0") String limit,
                                    @RequestParam(value = "offset", defaultValue = "10") String offset,
                                    @RequestAttribute Long adminId){
        return orderService.listOrder(limit,offset,adminId);
    }
    //派单
    @PostMapping("/dispatchOrder")
    public ResponseEntity dispatchOrder(String serviceId,@RequestAttribute Long adminId,Long techId){
        return orderService.dispatchOrder(serviceId,adminId,techId);
    }


    @PostMapping("/{serviceId}")
    public ResponseEntity detailOrder(@PathVariable(value = "serviceId") String serviceId,@RequestAttribute Long adminId){
        return orderService.details(serviceId,adminId);
    }

    @PostMapping("/export")
    public ResponseEntity exportOrder(@RequestAttribute Long adminId){
            return null;
    }




}
