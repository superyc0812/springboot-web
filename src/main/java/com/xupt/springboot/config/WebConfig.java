package com.xupt.springboot.config;

import com.xupt.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 配置拦截器的类(配置类)
 */
@Configuration      //需要添加其注解，进行标志为拦截器的配置类
public class WebConfig extends WebMvcConfigurationSupport{

    /**
     * 给其项目中添加拦截器(SpringBoot内嵌的Tomcat启动时，会自动解析该类初始化)
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {

        //需要拦截的路径数组
        String[] addPathPatterns = {
                "/boot/**"
        };
        //不需要拦截的路径数组
        String[] excludePathPatterns = {
                "/boot/hello"
        };
        //注册一个登录拦截器
        InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());
        interceptorRegistration.addPathPatterns(addPathPatterns);
        interceptorRegistration.excludePathPatterns(excludePathPatterns);

        //注册权限拦截器(拦截多个拦截器)
        //registry.addInterceptor(new AuthInterceptor()).addPathPatterns().excludePathPatterns();
    }
}
