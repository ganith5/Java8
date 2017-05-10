package com.java8.lambda;

/**
 * Created by pavithraabhishek on 4/25/17.
 */
public class Developer {

    Developer(String name, int age) {
        this.age = age;
        this.name = name;
    }

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Developer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
