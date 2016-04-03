package com.jiangjg.springstudy.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-3.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-generic-di.xml");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.add();
    }
}
