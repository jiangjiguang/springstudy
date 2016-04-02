package com.jiangjg.springstudy.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("h1");
        System.out.println("hello: " + helloWorld.getName());

        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());
    }
}
