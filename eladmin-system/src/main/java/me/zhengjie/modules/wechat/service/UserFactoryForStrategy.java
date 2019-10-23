package me.zhengjie.modules.wechat.service;

import me.zhengjie.modules.wechat.strategy.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserFactoryForStrategy {

    @Autowired
    Map<String, Strategy> Strategys =new ConcurrentHashMap<>(5);

    public Strategy getStrategy(String component) throws Exception{
        Strategy strategy=Strategys.get(component);
        if(null==strategy){
            throw new RuntimeException(" no strategy founded");
        }
        return strategy;
    }


}
