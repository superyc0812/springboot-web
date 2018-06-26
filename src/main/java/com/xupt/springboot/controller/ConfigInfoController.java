package com.xupt.springboot.controller;

import com.xupt.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringBoot读取自定义配置文件中的内容
 *
 * 读取配置自定义配置文件的Controller
 */
@Controller
public class ConfigInfoController {

    @Autowired
    private ConfigInfo configInfo;

    @Value("${boot.name}")
    private String name;

    @Value("${boot.location}")
    private String location;

    @RequestMapping(value = "/boot/config",produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String configInfo(){
        return name + "--" + location + "==" + configInfo.getName() + "--" +  configInfo.getLocation();
    }
}
