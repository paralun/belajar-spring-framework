/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

public class CustomerService {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void initIt() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }

    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
    
}
