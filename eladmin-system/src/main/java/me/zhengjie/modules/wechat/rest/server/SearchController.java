package me.zhengjie.modules.wechat.rest.server;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import me.zhengjie.modules.wechat.service.SearchService;
import me.zhengjie.modules.wechat.vo.QuerryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Date;

@RequestMapping(value = "/search",method = RequestMethod.POST)
@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

    @RequestMapping/*(consumes = "application/x-www-form-urlencoded;charset=UTF-8")*/
    //requestParam只能接受 form-data类型的和x-www-form-urlencoded
    public ResponseEntity searchService(@RequestParam String target,String data) throws ParseException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //System.out.println(querryData.toString());
        //System.out.println(querryData.toString());
        //return searchService.search(querryData);
        QuerryData querryData=null;
        Class clazz=Class.forName("me.zhengjie.modules.wechat.vo.QuerryData");
        char[] res=target.toCharArray();
        res[0]=(char) (res[0]-32);
        target=new String(res);
        if(target.equals("isDispatch")){
            Method setValue=clazz.getMethod("set"+target,Long.class);
            Constructor constructor = clazz.getConstructor();
            Object object=constructor.newInstance();
            setValue.invoke(object,Long.valueOf(data));
            Method getValue=clazz.getMethod("get"+target);
            System.out.println("Apple Price:" +getValue.invoke(object));
            querryData=(QuerryData)object;
        }else{
            Method setValue=clazz.getMethod("set"+target,String.class);
            Constructor constructor = clazz.getConstructor();
            Object object=constructor.newInstance();
            setValue.invoke(object,data);
            Method getValue=clazz.getMethod("get"+target);
            System.out.println("Apple Price:" +getValue.invoke(object));
            querryData=(QuerryData)object;
        }
        return searchService.search(querryData);

    }




}
