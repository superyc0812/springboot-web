package com.xupt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringBoot下使用JSP进行页面跳转
 *
 * 跳转控制器
 */
@Controller
public class JSPController {

    @GetMapping(value = "/boot/index")
    public String index(Model model){
        model.addAttribute("msg","SpringBoot中集成jsp");
        return "index";
    }

}
