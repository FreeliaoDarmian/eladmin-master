package me.zhengjie.modules.wechat.strategy;

import com.alibaba.fastjson.JSONArray;
import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.wechat.entity.Address;
import me.zhengjie.modules.wechat.entity.AddressExample;
import me.zhengjie.modules.wechat.repository.AddressMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component("4")
@Slf4j
public class UserAddresStrategy implements  Strategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInfoStrategy.class);
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    AddressMapper addressMapper;

    @Override
    public ResponseEntity doOperation(String openId, Integer limit, Integer offset) {
        List<Address> result=null;
        String key="address-"+openId;
        boolean haskey=redisTemplate.hasKey(key);
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        if(haskey){
            String res = valueOperations.get(key);
            result= JSONArray.parseArray(res,Address.class);
            log.info("从缓存中获取了地址集合:{}"+result);
            return new ResponseEntity(result, HttpStatus.OK);
        }
        AddressExample addressExample=new AddressExample();
        String pageSize=String.valueOf(limit);
        String pageNum=String.valueOf(offset);
        //addressExample.setOrderByClause("id limit "+pageNum+","+pageSize);
        addressExample.createCriteria().andOpenidEqualTo(openId);
        result = addressMapper.selectByExample(addressExample);
        String insert=JSONArray.toJSONString(result).toString();
        valueOperations.set(key,insert,30, TimeUnit.MINUTES);
        log.info("向缓存中插入集合:{}"+insert);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
