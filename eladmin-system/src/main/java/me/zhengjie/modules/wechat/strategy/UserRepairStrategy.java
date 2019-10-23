package me.zhengjie.modules.wechat.strategy;

import me.zhengjie.modules.wechat.service.WechatUserService;
import me.zhengjie.modules.wechat.vo.ProductOwnedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("3")
public class UserRepairStrategy implements Strategy {

    @Autowired
    WechatUserService wechatUserService;

    @Override
    public List<ProductOwnedVo> doOperation(String openId, Integer limit, Integer offset) {
        return wechatUserService.selectUserOwned(openId,limit,offset);
    }
}
