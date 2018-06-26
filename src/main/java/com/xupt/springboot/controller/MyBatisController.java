package com.xupt.springboot.controller;

import com.xupt.springboot.model.User;
import com.xupt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot整合MyBatis框架的控制器Controller
 */
@RestController
public class MyBatisController {

    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     * @return
     */
    @GetMapping(value = "/boot/getUserList")
    public Object getUserList(){
        return userService.getUserList();
    }

    /**
     * 更新用户信息
     * @return
     */
    @GetMapping(value = "/boot/update")
    public Object update(){
        User user = new User();
        user.setUserId(1);
        user.setUserName("张三-updaue");
        user.setGender("女");
        return userService.updateUserInfo(user);
    }
}
