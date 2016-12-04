/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigBean2 {
    
    private String driver;
    private String url;
    private String user;
    private String pass;

    public ConfigBean2() {
    }

    @Autowired
    public ConfigBean2(@Value("${jdbc.driver}") String driver, @Value("${jdbc.url}") String url, @Value("${jdbc.user}") String user, @Value("${jdbc.pass}") String pass) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "ConfigBean2{" + "driver=" + driver + ", url=" + url + ", user=" + user + ", pass=" + pass + '}';
    }
}
