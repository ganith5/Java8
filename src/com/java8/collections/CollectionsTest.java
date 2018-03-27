package com.java8.collections;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Pavithra Sachidananda on 11/12/17.
 */
public class CollectionsTest {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap<>();
        hashMap.put(null, "value");

        String str1 = "abc";
        System.out.println(str1 == "abc");

        String str2 = "abc";
        System.out.println(str1 == str2);

        String str3 = new String("abc");
        System.out.println(str1 == str3);

        String str4 = new String("def");

        hashMap.put(str1, str1);
        hashMap.put(str3, str3);
        hashMap.put(str4, str4);

        hashMap.put(1, str1);
        hashMap.put(2, str3);
        hashMap.put(3, str4);

        String str5 = "ab";
        str5 = str5 + "c";
        System.out.println(str2 == str5);


        System.out.println(hashMap);


    }
}
