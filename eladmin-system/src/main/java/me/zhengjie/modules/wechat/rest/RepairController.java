package me.zhengjie.modules.wechat.rest;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.enums.ResultEnum;
import me.zhengjie.modules.wechat.exception.SellException;
import me.zhengjie.modules.wechat.form.OrderFrom;
import me.zhengjie.modules.wechat.service.OrderService;
import me.zhengjie.modules.wechat.service.RepairService;
import me.zhengjie.modules.wechat.service.UserFactoryForStrategy;
import me.zhengjie.modules.wechat.strategy.Strategy;
import me.zhengjie.modules.wechat.utils.OrderFrom2ServiceInfoConverter;
import me.zhengjie.modules.wechat.vo.ProductOwnedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


//保修和配件的控制器
@RestController
@Slf4j
@RequestMapping(value="/repair",method = { RequestMethod.GET, RequestMethod.POST })
public class RepairController {

    @Autowired
    UserFactoryForStrategy userFactoryForStrategy;

    @Autowired
    RepairService repairService;

    @Autowired
    OrderService orderService;

    //猜你想修列表
    @RequestMapping("/wanted")
    //@Cacheable(cacheNames = "wanted", key = "#openId")
    public ResponseEntity getWanted(String openId,@RequestParam(value = "limit",defaultValue = "0") Integer limit,@RequestParam(value = "offset",defaultValue = "0") Integer offset) throws Exception{
            Strategy strategy = userFactoryForStrategy.getStrategy("3");
            List<ProductOwnedVo> result=strategy.doOperation(openId,limit,offset);
            return  new ResponseEntity(JSONObject.toJSONString(result), HttpStatus.OK);
    }

    //配件列表
    @RequestMapping("/accessory")
    //@Cacheable(cacheNames = "product", key = "#sellerId", condition = "#sellerId.length() > 3", unless = "#result.getCode() != 0")
    public ResponseEntity getAccessory(Integer limit,Integer offset){
        return repairService.selectPart(limit,offset);

    }

    //快速报修和报修接口
    @RequestMapping
    public ResponseEntity getRepair(@Valid OrderFrom orderFrom, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确, orderForm={}", orderFrom);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        ServiceInfo serviceInfo= OrderFrom2ServiceInfoConverter.converter(orderFrom);
        if(CollectionUtils.isEmpty(serviceInfo.getServicePicList())){
            log.error("【创建订单】图片不能为空");
            throw new SellException(ResultEnum.SERVERPICS_EMPTY);
        }
        return repairService.repair(serviceInfo);

    }

    //取消
    @RequestMapping("/cancel/{serviceId}")
    public ResponseEntity cancelOrder(@PathVariable String serviceId){
        return orderService.userCancelService(serviceId);
    }

    //订单列表
    @RequestMapping("/list")
    public ResponseEntity listOrder(@RequestParam("openId") String openId,
                                    @RequestParam(value = "limit", defaultValue = "0") Integer limit,
                                    @RequestParam(value = "offset", defaultValue = "10") Integer offset){
        if (StringUtils.isEmpty(openId)) {
            log.error("【查询订单列表】openid为空");
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        return orderService.listUserOrder(openId,limit,offset);
    }

}
