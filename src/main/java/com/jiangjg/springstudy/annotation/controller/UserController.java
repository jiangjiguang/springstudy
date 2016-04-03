package com.jiangjg.springstudy.annotation.controller;

import com.jiangjg.springstudy.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by root on 16-4-3.
 */

@Controller
public class UserController {

    /*
    自动装配具有兼容类型的单个bean
    构造器  字段  具有参数的方法
     */
    @Autowired
    private UserService userService;
    public void execute(){
        System.out.println("UserController execute");
        userService.add();
    }
}
