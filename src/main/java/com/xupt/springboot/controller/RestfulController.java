package com.xupt.springboot.controller;

import com.xupt.springboot.model.User;
import com.xupt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * SpringBoot结合Restful接口设计的简单使用
 *
 */
@RestController
public class RestfulController {

    @Autowired
    private UserService userService;

    /**
     * 使用Restful设计接口模拟访问url：http://localhost:9900/springboot-web/boot/getUserInfo/2
     * @return
     */
    @RequestMapping(value = "/boot/getUserInfo/{id}")
    public Object getUserInfo(@PathVariable("id") Integer userId){
        return userService.getUserInfo(userId);
    }

    /**
     * 使用Restful设计接口模拟访问url：http://localhost:9900/springboot-web/boot/getUserInfo/100/月落乌啼/男
     * @return
     */
    @RequestMapping(value = "/boot/getUserInfo/{id}/{name}/{gender}")
    public Object getUserInfo(@PathVariable("id") Integer userId,@PathVariable("name") String username,@PathVariable("gender") String gender){
        User user = new User();
        user.setUserId(userId);
        user.setUserName(username);
        user.setGender(gender);
        return user;
    }

    /**
     * 参数可以嵌套在url中的任何地方
     * 使用Restful设计接口模拟访问url：http://localhost:9900/springboot-web/boot/月落乌啼/getUserInfo/100
     * @return
     */
    @RequestMapping(value = "/boot/{name}/getUserInfo/{id}")
    public Object getUserInfo1(@PathVariable("id") Integer userId,@PathVariable("name") String username){
        User user = new User();
        user.setUserId(userId);
        user.setUserName(username);
        return user;
    }
}
