package com.jiangjg.springstudy.cycle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 16-4-2.
 */
public class Car {

    private String list = "st";

    public Car(){
        System.out.println("car construct");
        System.out.println(list);
    }

    static{
        System.out.println("static kuai");

    }

    {
        System.out.println("kuai");
        System.out.println(list);
    }



    public void init(){
        System.out.println("init2");
    }

    public void destroy(){
        System.out.println("destroy");
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
