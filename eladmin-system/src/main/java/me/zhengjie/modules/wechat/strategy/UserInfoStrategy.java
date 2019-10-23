package me.zhengjie.modules.wechat.strategy;

import me.zhengjie.modules.wechat.entity.WechatUser;
import me.zhengjie.modules.wechat.entity.WechatUserExample;
import me.zhengjie.modules.wechat.repository.WechatUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component("1")
public class UserInfoStrategy implements Strategy {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoStrategy.class);
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    WechatUserMapper wechatUserMapper;

    @Override
    public ResponseEntity doOperation(String openId, Integer limit, Integer offset) {
            WechatUser user=null;
            String key="user-"+openId;
            ValueOperations<String,WechatUser> res=redisTemplate.opsForValue();
            boolean haskey=redisTemplate.hasKey(key);
            if(haskey){
                 user=res.get(key);
                LOGGER.info("从缓存中获取了用户 >> " +"openid: "+ user.getOpenId()+", username: "+user.getNickName());
                return new ResponseEntity(user, HttpStatus.OK);
            }
            WechatUserExample example=new WechatUserExample();
            example.createCriteria().andOpenIdEqualTo(openId);
            user=wechatUserMapper.selectByExample(example).get(0);
            if(user!=null){
                res.set(key,user,30, TimeUnit.MINUTES);
                LOGGER.info("向缓存中插入了用户 >> " +"openid: "+ user.getOpenId()+", username: "+user.getNickName());
            }

        return new ResponseEntity(user, HttpStatus.OK);
    }
}
