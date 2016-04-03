package com.jiangjg.springstudy.aop;

/**
 * Created by root on 16-4-3.
 */

public class Main {

    public static void main(String[] args) {
        AtithmeticCaculator atithmeticCaculator = new AtithmeticCaculatorImpl();
        //int result = atithmeticCaculator.add(1 , 2);

        AtithmeticCaculator proxy = new AtithmeticCaculatorProxy(atithmeticCaculator).getLoggingPtoxy();

        System.out.println(proxy.add(1, 2));
    }
}
