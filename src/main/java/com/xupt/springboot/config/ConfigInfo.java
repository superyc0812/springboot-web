package com.xupt.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义配置映射一个类
 */
@Component      //将其变为Spring的一个组件，其他类若使用直接注解即可
@ConfigurationProperties(prefix = "boot")   //注解，配置前缀
public class ConfigInfo {

    private String name;

    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
