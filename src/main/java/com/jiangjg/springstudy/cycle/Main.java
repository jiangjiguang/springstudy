package com.jiangjg.springstudy.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-cycle.xml");
        Car car = applicationContext.getBean(Car.class);

    }

}
