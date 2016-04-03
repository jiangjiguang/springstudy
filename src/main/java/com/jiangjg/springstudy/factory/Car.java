package com.jiangjg.springstudy.factory;

/**
 * Created by root on 16-4-2.
 */
public class Car {

    public Car(){

    }

    public Car(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Car{" +
                "branch='" + branch + '\'' +
                '}';
    }

    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
