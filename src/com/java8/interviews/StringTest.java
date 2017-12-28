package com.java8.interviews;

import java.util.HashMap;

/**
 * Created by Pavithra Sachidananda on 12/5/17.
 */
public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("test1");
        String str2 = "test1";
        String str3 = "test1";
        String str4 = new String("test1");

        System.out.println("compare object to literal = " + (str1 == str2));
        System.out.println("literal compare = " + (str2 == str3));
        System.out.println("compare object to object = " + (str1 == str4));
        String str5 = str4.intern();
        System.out.println("compare after intern = " + (str2 == str5));
        System.out.println("compare after intern = " + (str4 == str5)); //STR1 is outside the pool, hence, false

        System.out.println("EQUALS = " + str4.equals(str5));

        HashMap<String, Integer> map = new HashMap<>();
        map.put(str2, 1);
        map.put(str3, 2);
        System.out.println("2 strings with same value as key " + map); // since its the same object, only one key is present
        map.put(str1, 3);
        System.out.println("Added a string object instead of literal : " + map); // so value is used as 'key'

    }
}
