/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component("application")
public class Application {
    
    @Resource(name = "applicationUser")
    private ApplicationUser user;

    @Override
    public String toString() {
        return "Application{" + "user=" + user + '}';
    }
}
