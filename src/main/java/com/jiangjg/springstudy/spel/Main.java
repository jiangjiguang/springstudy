package com.jiangjg.springstudy.spel;

import com.jiangjg.springstudy.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/beans-spel.xml");

        Person person2 = (Person) applicationContext.getBean("person");
        System.out.println(person2);
    }
}
