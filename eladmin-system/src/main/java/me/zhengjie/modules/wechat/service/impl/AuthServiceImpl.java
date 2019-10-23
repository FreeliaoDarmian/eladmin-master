package me.zhengjie.modules.wechat.service.impl;

import me.zhengjie.modules.wechat.entity.WechatUser;
import me.zhengjie.modules.wechat.repository.ProductBrandMapper;
import me.zhengjie.modules.wechat.repository.ProductClassMapper;
import me.zhengjie.modules.wechat.repository.ProductModelMapper;
import me.zhengjie.modules.wechat.repository.WechatUserMapper;
import me.zhengjie.modules.wechat.service.AuthService;
import me.zhengjie.modules.wechat.vo.WxBaseUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    WechatUserMapper wechatUserMapper;


    @Override
    public int insert(WxBaseUserInfo result) {
        WechatUser wechatUser=new WechatUser();
        wechatUser.setOpenId(result.getOpenid());
        wechatUser.setNickName(result.getNickname());
        wechatUser.setCity(result.getCity());
        wechatUser.setHeadImageUrl(result.getHeadimgurl());
        wechatUser.setProvince(result.getProvince());
        wechatUser.setSex(false);
        wechatUser.setUnionId(result.getUnionid());
        return wechatUserMapper.insert(wechatUser);
    }
}
