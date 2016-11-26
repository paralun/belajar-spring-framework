/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import java.util.Arrays;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdviceTest implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("Method name : " + mi.getMethod().getName());
        System.out.println("Method arguments : " + Arrays.toString(mi.getArguments()));

        // same with MethodBeforeAdvice
        System.out.println("Before method!");

        try {
            // proceed to original method call
            Object result = mi.proceed();

            // same with AfterReturningAdvice
            System.out.println("Before after hijacked!");

            return result;
        } catch (IllegalArgumentException ex) {
            // same with ThrowsAdvice
            System.out.println("HijackAroundMethod : Throw exception hijacked!");
            throw ex;

        }
    }

}
