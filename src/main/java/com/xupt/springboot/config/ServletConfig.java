package com.xupt.springboot.config;

import com.xupt.springboot.filter.OtherFilter;
import com.xupt.springboot.servlet.OtherServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * SpringBoot没有xml文件，@Configuration可表示为Spring中的xml配置文件；
 * 配置Servlet的类(配置类)；
 * SpringBoot启动时，自动扫描该类初始化；
 */
@Configuration
public class ServletConfig {
    /**
     * @Bean等价于Spring中xml的配置文件
     * <bean id="otherServletRegistrationBean" class="ServletRegistrationBean">
     * id 为方法名，class为方法的返回值
     */
    @Bean       //SpringBoot扫描该类，创建该对象，配合无注解Servlet的使用
    public ServletRegistrationBean otherServletRegistrationBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new OtherServlet(),"/otherServlet");
        return registrationBean;
    }
}
