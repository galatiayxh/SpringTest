package com.test.aop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;

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
}
