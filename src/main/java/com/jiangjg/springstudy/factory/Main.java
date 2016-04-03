package com.jiangjg.springstudy.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-3.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factory.xml");

        Car car = (Car) applicationContext.getBean("car2");

        System.out.println(car);
    }

}
