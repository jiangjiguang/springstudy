package com.jiangjg.single;

/**
 * Created by root on 16-5-15.
 */
public class Stage {
    private Stage(){
        System.out.println("construct");
    }
    private static class StageSingletonHolder{
        static Stage  instance = new Stage();
    }
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
