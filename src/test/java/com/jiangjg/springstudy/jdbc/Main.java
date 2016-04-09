package com.jiangjg.springstudy.jdbc;

import com.jiangjg.springstudy.annotation.controller.UserController;
import com.jiangjg.springstudy.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");

        //UserRepository repository = applicationContext.getBean(UserRepositoryImpl.class);
        //repository.save();
        //TestObject testObject = (TestObject) applicationContext.getBean("testObject");
        //System.out.println(testObject);

        //UserService userService = applicationContext.getBean(UserService.class);

        //userService.add();

        UserController userController = applicationContext.getBean(UserController.class);
        userController.execute();
    }
}
