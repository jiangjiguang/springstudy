package com.jiangjg.springstudy.aop.imp.xml;

import org.springframework.stereotype.Component;

/**
 * Created by root on 16-4-3.
 */

public class AtithmeticCaculatorImpl implements AtithmeticCaculator {
    public int add(int i, int j) {
        return i+j;
    }
}
