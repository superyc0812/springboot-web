package com.xupt.springboot.config;

import com.xupt.springboot.filter.OtherFilter;
import com.xupt.springboot.servlet.OtherServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * SpringBoot没有xml文件，@Configuration可表示为Spring中的xml配置文件；
 * 配置Filter的类(配置类)；
 * SpringBoot启动时，自动扫描该类初始化；
 */
@Configuration
public class FilterConfig {
    /**
     * @Bean等价于Spring中xml的配置文件
     * <bean id="otherFilterRegistration" class="FilterRegistrationBean">
     * id 为方法名，class为方法的返回值
     */
    @Bean       //SpringBoot扫描该类，创建该对象，配合无注解Filter的使用
    public FilterRegistrationBean otherFilterRegistration(){
        FilterRegistrationBean registrationBean =
                new FilterRegistrationBean(new OtherFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    /**
     * 对其请求，回应编码格式的过滤
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        //利用Spring内部提供的编码过滤器类
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("UTF-8");
        registrationBean.setFilter(characterEncodingFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

}
