package com.jiangjg.springstudy.cycle;

/**
 * Created by root on 16-4-2.
 */
public class Car2 {

    public void init(){
        System.out.println("init22");
    }

    public void destroy(){
        System.out.println("destroy2");
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
