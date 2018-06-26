package com.xupt.springboot.controller;

import com.xupt.springboot.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * SpringBoot下的SpringMVC简单使用
 *
 * 若跳转到jsp，其他的页面时，需要使用@Controller注解；
 * 因为@RestController注解处理完请求后，只能返回JSON对象数据或者字符串
 */
@RestController     //相当于 @Controller + @ResponseBody
public class MVCController {

    /**
     * @RequestMapping  自动返回JSON对象数据或者字符串格式
     * @return
     */
    @RequestMapping(value = "/boot/getUser",method = RequestMethod.GET)
    public Object getUser(){
        User user = new User();
        user.setUserId(98);
        user.setUserName("超哥");

        return user;
    }

    /**
     * 使用场景：客户端与服务器端交互（查询、搜索、读等操作）
     * @GetMapping  只支持get请求，相当于 @RequestMapping + Get请求方式
     * @return
     */
    @GetMapping(value = "/boot/getUserByGet")
    public User getUserByGet(){
        User user = new User();
        user.setUserId(99);
        user.setUserName("帅");

        return user;
    }

    /**
     * 使用场景：客户端与服务器交互是一个命令或表单，订阅某项服务等操作
     * 浏览器地址栏请求方式为get请求，不支持，出现405错误
     * @PostMapping  只支持post请求，相当于 @RequestMapping + Post请求方式
     * @return
     */
    @PostMapping(value = "/boot/getUserByPost")
    public User getUserByPost(){
        User user = new User();
        user.setUserId(100);
        user.setUserName("超哥帅");

        return user;
    }
}
