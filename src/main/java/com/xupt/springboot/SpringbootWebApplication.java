package com.xupt.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication    	 	//注解是SpringBoot项目的核心注解，主要作用是开启Spring自动配置
//@MapperScan(basePackages = "com.xupt.springboot.mapper")
@EnableTransactionManagement	//开启SpringBoot的事务支持
@ServletComponentScan(basePackages = {"com.xupt.springboot.servlet","com.xupt.springboot.filter"})		//配置注解，扫描Servlet.filter包
public class SpringbootWebApplication {

	public static void main(String[] args) {
		//启动了SpringBoot程序，启动Spring容器，启动内嵌的Tomcat服务器
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
}
