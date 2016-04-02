package com.jiangjg.springstudy.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-autowire.xml");

        Person person = applicationContext.getBean(Person.class);

        System.out.println(person);
    }
}
