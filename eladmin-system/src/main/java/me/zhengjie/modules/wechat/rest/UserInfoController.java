package me.zhengjie.modules.wechat.rest;

import me.zhengjie.modules.wechat.entity.WechatUser;
import me.zhengjie.modules.wechat.service.UserFactoryForStrategy;
import me.zhengjie.modules.wechat.service.WechatUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    UserFactoryForStrategy userFactoryForStrategy;

    @PostMapping
    public ResponseEntity userDetails(String openId, String type, @RequestParam(value = "limit",required = false)  Integer limit,@RequestParam(value = "offset",required = false) Integer offset){
        try{
             return userFactoryForStrategy.getStrategy(type).doOperation(openId, limit, offset);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }

}
