/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app;

import org.springframework.beans.factory.annotation.Required;

public class Customer {
    
    private Person person;
    private int type;
    private String action;

    public Person getPerson() {
        return person;
    }
    
    @Required
    public void setPerson(Person person) {
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Customer{" + "person=" + person + ", type=" + type + ", action=" + action + '}';
    }
}
