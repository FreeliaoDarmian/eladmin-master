package me.zhengjie.modules.wechat.service;

import me.zhengjie.modules.wechat.vo.ProductOwnedVo;

import java.util.List;

public interface WechatUserService {
    List<ProductOwnedVo> selectUserOwned(String openId, Integer limit, Integer offset);
}
