package com.jiangjg.springstudy.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by root on 16-4-3.
 */
public class MyBeanPostProcessor  implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("postProcessBeforeInitialization" + o + " " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {

        System.out.println("postProcessBeforeInitialization" + o + " " + s);
        Car car = new Car();
        car.setBranch("雪佛兰");
        return o;
    }
}
