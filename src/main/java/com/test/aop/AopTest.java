package com.test.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

@Log
public class AopTest {
    //执行之后的方法
    public void after() {
        log.info("我是执行之后");
    }

    //执行之前的方法
    public void before(JoinPoint point) {
        log.info("我是执行之前");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法开始之前");
        Object value = joinPoint.proceed();
        System.out.println("方法执行完成，结果为："+value);
        return value;
    }
}
