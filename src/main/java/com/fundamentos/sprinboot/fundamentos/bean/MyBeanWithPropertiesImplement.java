package com.fundamentos.sprinboot.fundamentos.bean;

public class MyBeanWithPropertiesImplement implements MyBeanWithProperties{

    private int id;
    private String description;

    private int value;

    public MyBeanWithPropertiesImplement(int id, String description, int value) {
        this.id = id;
        this.description = description;
        this.value = value;
    }

    @Override
    public String function() {
        return id + " - " + description + " - " + value;
    }
}
