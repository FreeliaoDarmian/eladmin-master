package me.zhengjie.modules.wechat.service;

import me.zhengjie.modules.wechat.vo.QuerryData;
import org.springframework.http.ResponseEntity;

public interface SearchService {
    ResponseEntity search(QuerryData querryData);
}
