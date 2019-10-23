package me.zhengjie;

import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.wechat.entity.ServiceInfo;
import me.zhengjie.modules.wechat.entity.WechatUser;
import me.zhengjie.modules.wechat.entity.WechatUserExample;
import me.zhengjie.modules.wechat.repository.WechatUserMapper;
import me.zhengjie.modules.wechat.service.MessageService;
import me.zhengjie.modules.wechat.service.SearchService;
import me.zhengjie.modules.wechat.vo.QuerryData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppRun.class})
@Slf4j
public class EladminSystemApplicationTests {

    @Autowired
    SearchService searchService;

    @Autowired
    MessageService service;

    @Test
    public void contextLoads() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ParseException {
        QuerryData querryData=null;

        Class clazz=Class.forName("me.zhengjie.modules.wechat.vo.QuerryData");
        String target="progressDate";
        char[] res=target.toCharArray();
        res[0]=(char) (res[0]-32);
        log.info("res:{}"+Arrays.toString(res));
        target=new String(res);
        Method setValue=clazz.getMethod("set"+target, Date.class);
        Constructor constructor = clazz.getConstructor();
        Object object=constructor.newInstance();
        String before=new SimpleDateFormat("yyyy-MM-dd").parse("20180918").toString();
        setValue.invoke(object,null);
        Method getValue=clazz.getMethod("get"+target);
        System.out.println("Apple Price:" +getValue.invoke(object));
        querryData=(QuerryData)object;
        log.info("querryData:{}"+querryData);

    }

    @Test
    public void contextLoads2() throws ParseException {
        Date date=new SimpleDateFormat("yyyy-MM-dd").parse("2018-09-28");
        //Date a=new Date(1112323);
        System.out.println(date);
        System.out.println("当前的系统日期为：" +  new SimpleDateFormat("yyy-MM-dd").format(date.getTime()));
    }

}

