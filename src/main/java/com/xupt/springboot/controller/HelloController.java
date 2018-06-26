package com.xupt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 第一个SpringBoot的学习Controller
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/boot/hello",produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String hello(){
        return "hello 西安邮电大学!";
    }

}
