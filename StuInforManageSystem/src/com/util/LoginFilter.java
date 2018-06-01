package com.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
 
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器初始化中...");
    }
 
    public void destroy() {
 
    }
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
 
        HttpSession session = httpServletRequest.getSession();
        System.out.println("开始过滤....");
 
        if (httpServletRequest.getServletPath().indexOf("index.jsp") > 0 || httpServletRequest.getServletPath().indexOf("com/servlet/LoginServlet") > 0) {
            System.out.println("放过该请求...");
            chain.doFilter(request, response);
        } else {
 
            String user = (String) session.getAttribute("username");
            if (user != null) {
                System.out.println("已登录，取消过滤...");
                chain.doFilter(request, response);
 
            } else {
                System.out.println("未登录，跳转到登录页面...");
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/index.jsp");
            }
        }
        System.out.println("完成过滤....");
    }
}