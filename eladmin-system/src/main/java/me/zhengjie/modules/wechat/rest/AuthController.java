package me.zhengjie.modules.wechat.rest;

import lombok.extern.slf4j.Slf4j;
import me.zhengjie.modules.wechat.entity.WechatUser;
import me.zhengjie.modules.wechat.service.AuthService;
import me.zhengjie.modules.wechat.utils.HttpRequestUtil;
import me.zhengjie.modules.wechat.utils.WeixinAccessTokenTask;
import me.zhengjie.modules.wechat.vo.WeixinConstants;
import me.zhengjie.modules.wechat.vo.WxBaseUserInfo;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

//微信授权接口
@RestController
@RequestMapping(value = "/auth",method = {RequestMethod.POST,RequestMethod.GET})
@Slf4j
public class AuthController {
    @Autowired
    AuthService authService;

    @Autowired
    WeixinAccessTokenTask weixinAccessTokenTask;

    /*@RequestMapping
    public void auth(HttpServletResponse response) throws IOException {
        /*String url = "https://api.weixin.qq.com/sns/userinfo"
                +"access_token=access_Token&openid=openId&lang=zh_CN";
        String requestUrl=url.replace("openId", openid).replace("access_Token",weixinAccessTokenTask.getWeixinAccessToken() );
        /**Map<String, String> params = new HashMap<>();
        params.put("access_token",weixinAccessTokenTask.getWeixinAccessToken());
        params.put("openid", openid);
        params.put("lang", "zh_CN");
        log.info("openid"+openid+","+"----------------"+"access_token"+weixinAccessTokenTask.getWeixinAccessToken());
        WxBaseUserInfo result=null;**/
        //try{
           // result=restTemplate.getForObject(url,WxBaseUserInfo.class,params);
           // JSONObject jsonObject=HttpRequestUtil.httpsRequest(requestUrl,"GET",null);
            //log.info("get到的对象:{}"+jsonObject);
            /*if(null== result || !result.valid()){
                return new ResponseEntity(HttpStatus.NOT_FOUND);
            }
            authService.insert(result);
        }catch (RestClientException e){
            e.printStackTrace();
        }*/
       /* String callBack = "27y210728s.zicp.vip/auth/callBack";
        //请求地址
        String url = "https://open.weixin.qq.com/connect/oauth2/authorize" +
                "?appid=" + WeixinConstants.APPID +
                "&redirect_uri=" + callBack +
                "&response_type=code" +
                "&scope=snsapi_userinfo" +
                "&state=STATE#wechat_redirect";
        //重定向
        //response.sendRedirect(url);
    }

    /*@RequestMapping("/callback")
    public ResponseEntity callback(HttpServletResponse response, HttpServletRequest servletRequest){
            String code=servletRequest.getParameter("code");
        String weixinAccessToken = weixinAccessTokenTask.getWeixinAccessToken(code);
        log.info("获取到的token:{}"+ JSONObject.fromObject(weixinAccessToken));
       /* String url = "https://api.weixin.qq.com/sns/userinfo"
                +"access_token=access_Token&openid=openId&lang=zh_CN";
        String requestUrl=url.replace("openId",).replace("access_Token",);
        JSONObject jsonObject=HttpRequestUtil.httpsRequest(requestUrl,"GET",null);
        log.info("get到的对象:{}"+jsonObject);*/
        //return new ResponseEntity(HttpStatus.OK);
    //}


    @RequestMapping
    public ResponseEntity auth(@RequestBody WxBaseUserInfo wxBaseUserInfo){
         authService.insert(wxBaseUserInfo);
         return new ResponseEntity(HttpStatus.OK);
    }

}
