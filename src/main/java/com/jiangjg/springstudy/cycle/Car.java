package com.jiangjg.springstudy.cycle;

/**
 * Created by root on 16-4-2.
 */
public class Car {

    public void init2(){
        System.out.println("init2");
    }

    public void destroy(){
        System.out.println("destroy");
    }

    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
