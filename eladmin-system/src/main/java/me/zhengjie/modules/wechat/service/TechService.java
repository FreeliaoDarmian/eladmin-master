package me.zhengjie.modules.wechat.service;

import me.zhengjie.modules.wechat.entity.Tech;
import org.springframework.http.ResponseEntity;

public interface TechService {
    ResponseEntity insert(Tech tech,Long userId);

    ResponseEntity list(String limit,String offset,Long userId);

    ResponseEntity findOne(Integer techId,Long userId);

    ResponseEntity kickOut(Integer techId,Long userId);
}
