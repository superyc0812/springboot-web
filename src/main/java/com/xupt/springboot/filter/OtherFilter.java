package com.xupt.springboot.filter;

import javax.servlet.*;
import java.io.IOException;
/**
 * 方式二：使用SpringBoot的配置类实现
 */
public class OtherFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入other filter过滤器......");
        //向下继续传递请求过滤
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
