package com.jiang.ssm.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        if (requestURI.contains("login")|| requestURI.contains("js") || requestURI.endsWith("css") || requestURI.contains("image")) {
            return true;
        }
        Object tea = request.getSession().getAttribute("tea");
        Object stu = request.getSession().getAttribute("stu");
        if (stu != null || tea !=null) {
            Object last = request.getSession().getAttribute("last");
            if (last!=null){
                handler = last;
                request.getSession().removeAttribute("last");
            }
            return true;
        }
        request.getSession().setAttribute("last",handler);
        response.sendRedirect(request.getContextPath()+"/login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) throws Exception {

    }
}
