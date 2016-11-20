/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.factorybean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryBean {
    
    private List<String> lists;
    private Set<String> sets;
    private Map<String, String> maps;

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    @Override
    public String toString() {
        return "FactoryBean{" + "lists=" + lists + ", sets=" + sets + ", maps=" + maps + '}';
    }
}
