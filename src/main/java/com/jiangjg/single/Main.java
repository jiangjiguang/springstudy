package com.jiangjg.single;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-4-2.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/beans-single.xml");
        Stage stage1 = (Stage) applicationContext.getBean("stage3");
        Stage stage2 = (Stage) applicationContext.getBean("stage3");
        Stage stage3 = (Stage) applicationContext.getBean("stage3");
        Stage stage4 = (Stage) applicationContext.getBean("stage3");
        //System.out.println(car.getBranch());
        //关闭IOC容器
        applicationContext.close();


    }

}
