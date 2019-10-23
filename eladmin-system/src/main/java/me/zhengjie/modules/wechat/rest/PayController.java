package me.zhengjie.modules.wechat.rest;

import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.enums.ResultEnum;
import me.zhengjie.modules.wechat.exception.SellException;
import me.zhengjie.modules.wechat.service.OrderService;
import me.zhengjie.modules.wechat.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/pay",method={RequestMethod.POST})
@RestController
public class PayController {

   @Autowired
   PayService payService;

   @Autowired
   OrderService orderService;



   @RequestMapping("/create")
   public ResponseEntity create(@RequestParam("serviceId")String serviceId){
        //1:查询订单
       ServiceInfo serviceInfo=orderService.findOne(serviceId);
       if(serviceInfo==null){
           throw new SellException(ResultEnum.ORDER_NOT_EXIST);
       }
       return payService.create(serviceInfo);
   }

    @RequestMapping("/notify")
    public ResponseEntity notify(@RequestBody String notifyData) {
        payService.notify(notifyData);

        //返回给微信处理结果
        return new ResponseEntity(HttpStatus.OK);
    }

}
