package com.paralun.app.bean;

public class CustomerInnerBean {
    private PersonInnerBean person;

    public void setPerson(PersonInnerBean person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "CustomerInnerBean{" + "person=" + person + '}';
    }
}
