package com.jiangjg.springstudy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by root on 16-4-3.
 */
public class AtithmeticCaculatorProxy {

    //要代理的对象
    private AtithmeticCaculator atithmeticCaculator;

    public AtithmeticCaculatorProxy(AtithmeticCaculator atithmeticCaculator) {
        this.atithmeticCaculator = atithmeticCaculator;
    }

    public AtithmeticCaculator getLoggingPtoxy(){
        AtithmeticCaculator proxy = null;

        //代理对象由哪个类加载其加载
        ClassLoader loader =  atithmeticCaculator.getClass().getClassLoader();
        //代理对象的类型，即其中有哪些方法
        Class[] interfaces = new Class[]{AtithmeticCaculator.class};
        //当调用代理对象的方法时，该执行的代码
        InvocationHandler handler = new InvocationHandler() {
            /*
            proxy 正在返回的代理对象，一般情况下都不会使用该对象
            method 正在被条用的方法
            args 传入的参数
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                //System.out.println(proxy.toString());

                String methodName = method.getName();
                //日志
                System.out.println("the method " + methodName + " " + Arrays.asList(args));
                //执行方法
                Object result = method.invoke(atithmeticCaculator, args);
                //日志
                System.out.println("the result " + methodName + " " + result);
                return result;
            }
        };

        proxy = (AtithmeticCaculator) Proxy.newProxyInstance(loader, interfaces, handler);
        return proxy;
    }
}
