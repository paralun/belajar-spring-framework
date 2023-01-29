/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("Before Method");
    }
    
}
