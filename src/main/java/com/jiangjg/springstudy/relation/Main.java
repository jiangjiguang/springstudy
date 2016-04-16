package com.jiangjg.springstudy.relation;

import com.jiangjg.springstudy.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/beans-relation.xml");

        Person person2 = (Person) applicationContext.getBean("person3");
        System.out.println(person2);
    }
}
