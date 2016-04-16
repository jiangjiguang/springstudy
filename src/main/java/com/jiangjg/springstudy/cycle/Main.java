package com.jiangjg.springstudy.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/beans-cycle.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.getBranch());
        //关闭IOC容器
        applicationContext.close();


    }

}
