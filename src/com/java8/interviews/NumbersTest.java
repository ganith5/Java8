package com.java8.interviews;

/**
 * Created by Pavithra Sachidananda on 11/22/17.
 */
public class NumbersTest {

    public static void main(String[] args) {
        Object obj = 1/2;
        decision(obj);

        obj = 1.0/2;
        decision(obj);

        obj = 1.0/2.0;
        decision(obj);

        obj = 1L/2L;
        decision(obj);

        float f = 100L;
        double d = f;
        System.out.println("Double value = "+ d);

        d = 106900.0909009090909090;
        f = (float)d;
        System.out.println("Double value = "+ d + " Float value = "+ f);

    }

    public static void decision(Object obj) {
        if(obj instanceof Integer){
            System.out.println("Integer : " + obj);

        } else if(obj instanceof Long){
            System.out.println("Integer : " + obj);
        } else if(obj instanceof Double) {
            System.out.println("Double : " + obj);
        }
    }
}
