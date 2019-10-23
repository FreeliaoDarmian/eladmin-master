package me.zhengjie.modules.wechat.utils;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Component
public class OrderUploadUtils {

    private static String dir="D:/img";

    public static ResponseEntity uploadImage(MultipartFile[] file,String openId){
        List<String> res=new ArrayList<>();
        for(MultipartFile f:file){
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        String currentDate=simpleDateFormat.format(new Date());
        String fileName=f.getOriginalFilename();
        System.out.println(fileName);
        String realPath=dir+"/"+openId.substring(0,6)+"/"+currentDate+"/";
        System.out.println(realPath);
        File fileDr=new File(realPath);
        if(!fileDr.exists()){
            fileDr.mkdirs();
        }
        String extName= FilenameUtils.getExtension(fileName);
        String allowImgFormat="gif,jpg,jpeg,png";
        if(!allowImgFormat.contains(extName.toLowerCase())){
            return new ResponseEntity("传入的不是图片类型", HttpStatus.NOT_FOUND);
        }
            SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd&HH-mm-ss");
            String currentTime = Format.format(new Date());
            fileName = currentTime + UUID.randomUUID() + ".jpg";
            InputStream inputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = f.getInputStream();
                fileOutputStream = new FileOutputStream(realPath + fileName);
                IOUtils.copy(inputStream, fileOutputStream);
                res.add("/static"+"/"+openId.substring(0,6)+"/" + currentDate + "/" + fileName);
            } catch (IOException e) {
                e.printStackTrace();
                return new ResponseEntity("图片存储失败",HttpStatus.NOT_FOUND);
            } finally {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly(fileOutputStream);
            }
        }
        return new ResponseEntity(res,HttpStatus.OK);
    }
}
