package me.zhengjie.modules.wechat.service.impl;

import me.zhengjie.modules.wechat.entity.Tech;
import me.zhengjie.modules.wechat.entity.TechExample;
import me.zhengjie.modules.wechat.entity.WechatUser;
import me.zhengjie.modules.wechat.entity.WechatUserExample;
import me.zhengjie.modules.wechat.enums.ResultEnum;
import me.zhengjie.modules.wechat.exception.SellException;
import me.zhengjie.modules.wechat.repository.TechMapper;
import me.zhengjie.modules.wechat.repository.WechatUserMapper;
import me.zhengjie.modules.wechat.service.TechService;
import me.zhengjie.modules.wechat.vo.TechVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechServiceImpl implements TechService {

    @Autowired
    WechatUserMapper wechatUserMapper;

    @Autowired
    TechMapper techMapper;

    @Override
    public ResponseEntity insert(Tech tech,Long userId) {
        int res=techMapper.insert(tech);
        if(res<=0){
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity list(String limit,String offset,Long userId) {
        List<TechVo> res=new ArrayList<>();
        TechExample techExample=new TechExample();
        techExample.setOrderByClause("id limit "+limit+","+offset);
        List<Tech> teches = techMapper.selectByExample(techExample);
        teches.forEach(tech -> {
            WechatUserExample wechatUserExample=new WechatUserExample();
            wechatUserExample.createCriteria().andOpenIdEqualTo(tech.getOpenId());
            WechatUser wechatUser = wechatUserMapper.selectByExample(wechatUserExample).get(0);
            TechVo techVo=new TechVo();
            techVo.setWorkerNo(tech.getWorkerNo());
            techVo.setStatus(tech.getStatus());
            techVo.setLastOrderTime(tech.getLastOrderTime());
            techVo.setOrderNum(tech.getOrderNum());
            techVo.setCompleteNum(tech.getCompleteNum());
            techVo.setPhoneNum(tech.getPhoneNum());
            techVo.setHeadImageUrl(wechatUser.getHeadImageUrl());
            techVo.setSex(wechatUser.getSex());
            techVo.setName(wechatUser.getNickName());
            res.add(techVo);
        });
        return new ResponseEntity(res,HttpStatus.OK);
    }

    @Override
    public ResponseEntity findOne(Integer techId,Long adminId) {
        Tech tech=techMapper.selectByPrimaryKey(techId);
        if(tech==null){
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @Override
    public ResponseEntity kickOut(Integer techId,Long userId) {
        Tech tech=techMapper.selectByPrimaryKey(techId);
        tech.setStatus("封禁");
        int res= techMapper.updateByPrimaryKey(tech);
        if(res<=0){
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
