package com.jiangjg.springstudy.aop.imp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 16-4-3.
 */
//把这个类声明为一个切面，并且放入IOC容器中
@Order(1)   //执行切面的优先级
@Aspect
@Component
public class LoggingAspect {

    //定义一个方法，用于声明切入点表达式，一般的该方法中不需要添加其他方法
    @Pointcut("execution(public int com.jiangjg.springstudy.aop.imp.AtithmeticCaculator.*(int ,  int ))")
    public void declareJoinPointExpresion(){}


    //该方法是前置通知, 在目标方法前执行该方法
    @Before(value = "declareJoinPointExpresion()")
    public  void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName);
        System.out.println(list);
        System.out.println("beforeMethod");
    }

    //该方法是hou置通知, 无论方法是否异常，该方法都会被执行，但是不能访问方法的执行结果
    @After("execution(public int com.jiangjg.springstudy.aop.imp.AtithmeticCaculator.*(int ,  int ))")
    public  void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName);
        System.out.println(list);
        System.out.println("afterMethod");
    }

    //返回通知,可以访问到方法的返回值
    @AfterReturning(value = "execution(public int com.jiangjg.springstudy.aop.imp.AtithmeticCaculator.*(.. ))",  returning = "result")
    public  void afterReturning(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName);
        System.out.println(result);
        System.out.println("afterReturning");
    }

    //y异常通知,可以访问到方法的返回值
    @AfterThrowing(value = "execution(public int com.jiangjg.springstudy.aop.imp.AtithmeticCaculator.*(.. ))", throwing = "result")
    public  void afterThrowing(JoinPoint joinPoint, Exception result){
        String methodName = joinPoint.getSignature().getName();
        List<Object> list = Arrays.asList(joinPoint.getArgs());
        System.out.println(methodName);
        System.out.println(result);
        System.out.println("afterThrowing");
    }

    //环绕通知
    //类似与动态代理的全过程，且必须有返回值
    @Around(value = "execution(public int com.jiangjg.springstudy.aop.imp.AtithmeticCaculator.*(.. ))")
    public  Object around(ProceedingJoinPoint point){
        System.out.println("around");
        return 100000;
    }
}
