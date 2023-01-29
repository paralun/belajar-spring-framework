/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example1;

public class TransaksiBean {
    
    private PersonBean personBean;
    private CustomerBean customerBean;

    public TransaksiBean(PersonBean personBean, CustomerBean customerBean) {
        this.personBean = personBean;
        this.customerBean = customerBean;
    }

    public PersonBean getPersonBean() {
        return personBean;
    }

    public void setPersonBean(PersonBean personBean) {
        this.personBean = personBean;
    }

    public CustomerBean getCustomerBean() {
        return customerBean;
    }

    public void setCustomerBean(CustomerBean customerBean) {
        this.customerBean = customerBean;
    }
}
