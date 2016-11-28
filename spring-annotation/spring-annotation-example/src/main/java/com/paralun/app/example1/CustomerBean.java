/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

public class CustomerBean {
    private PersonBean personBean;

    public CustomerBean(PersonBean personBean) {
        this.personBean = personBean;
    }

    public PersonBean getPersonBean() {
        return personBean;
    }

    public void setPersonBean(PersonBean personBean) {
        this.personBean = personBean;
    }
}
