package com.java8.interviews;

import java.util.Optional;

/**
 * Created by Pavithra Sachidananda on 11/22/17.
 */
public class SwappingStrings {

    public static void main(String[] args) {
        String str1 = "pavi";
        String str2 = "2017";

        Optional.of(str1);



        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length()-str2.length()));
        str1 = str1.substring(str2.length(), str1.length());
        System.out.println("str1 = " + str1 + " str2=  " + str2);

        Object obj = 1/2.0;

//        Double d = (Double)obj;
//        System.out.print("D = " + d);
//
//        Long l = (Long)obj;
//        System.out.println("L = " + l);

        if(obj instanceof Integer) {
            System.out.println("I = " + obj);

        }

        if(obj instanceof Long) {
            System.out.println("L = " + obj);

        }

        if(obj instanceof Double) {
            System.out.println("D = " + obj);

        }

    }
}
