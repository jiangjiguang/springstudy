package com.jiangjg.springstudy.factotybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-3.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-factorybean.xml");

        Car car = (Car) applicationContext.getBean("car");

        System.out.println(car);
    }

}
