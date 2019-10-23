package me.zhengjie.modules.wechat.service;

import me.zhengjie.modules.wechat.entity.ServiceInfo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RepairService {
    //报修
    ResponseEntity repair(ServiceInfo serviceInfo);

    //查找配件
    ResponseEntity selectPart(Integer limit,Integer offset);

}
