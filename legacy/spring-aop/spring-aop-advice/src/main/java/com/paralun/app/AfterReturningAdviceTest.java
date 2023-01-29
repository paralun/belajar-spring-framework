/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterReturningAdviceTest implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("After return advice!");
    }
    
}
