package com.java8.methodref;

/**
 * Created by pavithraabhishek on 4/25/17.
 */
public class Jedi {

    private int power;
    private String name;

    Jedi(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
