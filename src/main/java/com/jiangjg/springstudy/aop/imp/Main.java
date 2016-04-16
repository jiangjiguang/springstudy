package com.jiangjg.springstudy.aop.imp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-3.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/beans-aop.xml");

        AtithmeticCaculator atithmeticCaculator =  applicationContext.getBean(AtithmeticCaculator.class);

        int result = atithmeticCaculator.add(1, 3);

        System.out.println(result);

    }
}
