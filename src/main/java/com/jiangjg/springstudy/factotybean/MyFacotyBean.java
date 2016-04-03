package com.jiangjg.springstudy.factotybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by root on 16-4-3.
 */
public class MyFacotyBean implements FactoryBean<Car> {
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    private String branch;

    public Car getObject() throws Exception {
        return new Car(branch);
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
