package com.paralun.app.date;

import java.util.Date;

public class DateExample {
    
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DateExample{" + "date=" + date + '}';
    }
}
