package me.zhengjie.modules.wechat.service.impl;

import me.zhengjie.modules.wechat.entity.*;
import me.zhengjie.modules.wechat.repository.*;
import me.zhengjie.modules.wechat.service.WechatUserService;
import me.zhengjie.modules.wechat.vo.ProductOwnedVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WechatUserServiceImpl implements WechatUserService {

    @Autowired
    ProductClassMapper productClassMapper;

    @Autowired
    ProductModelMapper productModelMapper;

    @Autowired
    ProductBrandMapper productBrandMapper;

    @Autowired
    WechatUserMapper wechatUserMapper;

    @Autowired
    UserOwnedMapper userOwnedMapper;

    @Override
    public List<ProductOwnedVo> selectUserOwned(String openId, Integer limit, Integer offset) {
        List<ProductOwnedVo> result=new ArrayList<>();
        WechatUserExample example=new WechatUserExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        WechatUser wechatUser=wechatUserMapper.selectByExample(example).get(0);
        UserOwnedExample example1=new UserOwnedExample();
        example1.createCriteria().andUserIdEqualTo(wechatUser.getId());
        List<UserOwned> userOwneds = userOwnedMapper.selectByExample(example1);
        userOwneds.forEach(
                userOwned -> {
                    ProductModel productModel = productModelMapper.selectByPrimaryKey(userOwned.getProductId());
                    ProductOwnedVo productOwnedVo=new ProductOwnedVo();
                    productOwnedVo.setUserOwnedOrderTime(userOwned.getUserOwnedOrderTime());
                    productOwnedVo.setUserOwnedIntime(userOwned.getUserOwnedIntime());
                    productOwnedVo.setUserOwnedAddress(userOwned.getUserOwnedAddress());
                    productOwnedVo.setModelName(productModel.getModelName());
                    productOwnedVo.setAccountPrice(productModel.getAccountPrice());
                    productOwnedVo.setBrandName(productBrandMapper.selectByPrimaryKey(productModel.getBrandId()).getBrandName());
                    result.add(productOwnedVo);
                }
        );
        return result;
    }
}
