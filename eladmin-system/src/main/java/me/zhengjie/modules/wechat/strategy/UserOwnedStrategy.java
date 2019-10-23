package me.zhengjie.modules.wechat.strategy;

import me.zhengjie.modules.wechat.service.WechatUserService;
import me.zhengjie.modules.wechat.vo.ProductOwnedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("2")
public class UserOwnedStrategy implements Strategy {

    @Autowired
    WechatUserService wechatUserService;

    @Override
    public ResponseEntity doOperation(String openId, Integer limit, Integer offset) {
        List<ProductOwnedVo> productOwnedVos = wechatUserService.selectUserOwned(openId, limit, offset);
        return new ResponseEntity(productOwnedVos, HttpStatus.OK);
    }
}
