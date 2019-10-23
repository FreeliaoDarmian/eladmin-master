package me.zhengjie.modules.wechat.rest;

import me.zhengjie.modules.wechat.utils.OrderUploadUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/file")
@RestController
public class FileController {


    @PostMapping("/upload")
    public ResponseEntity upload(String openId, MultipartFile[] file){
        if(!(file.length==0)){
            return OrderUploadUtils.uploadImage(file,openId);
        }else{
            return new ResponseEntity("文件为空", HttpStatus.NOT_FOUND);
        }

    }



}
