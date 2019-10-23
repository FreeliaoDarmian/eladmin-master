package me.zhengjie.modules.wechat.interceptor;

import me.zhengjie.utils.SecurityUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class UserNameInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws  Exception{
        System.out.println(request.getRequestURI());
        /*if (request.getRequestURI().equals("/city/login")||request.getRequestURI().equals("/user/login_view")){
            return true;
        }
        Object obj = request.getSession().getAttribute("session_user");
        if (obj == null){
            response.sendRedirect("/user/login_view");
            return  false;
        }*/
        request.setAttribute("adminId", 1);
        return true;
    }
}
