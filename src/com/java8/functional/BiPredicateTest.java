package com.java8.functional;

import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by pavithraabhishek on 4/29/17.
 */
public class BiPredicateTest {

    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
        System.out.println("Result : " + biPredicate.test("Apple", "Orange"));

        DoublePredicate doublePredicate1 = d1 -> d1 > 100.2;
      //  System.out.println("Double Result1 : " + doublePredicate1.test(100.2));
        System.out.println("Negate : " + doublePredicate1.negate().test(100));

        DoublePredicate doublePredicate2 = d2 -> d2 > 100;
       // doublePredicate2.test(100);
        System.out.println("Double Result2 : " + doublePredicate1.and(doublePredicate2).test(100.1));



        List<Integer> source = Arrays.asList(1,2,3,4,5,6,7,8,9, 10);
        System.out.println("Even numbers list : " + filter(source, i -> i % 2 == 0));

        Predicate oddPredicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                Integer i = (Integer)o;
                if(i % 2 != 0){
                    return  true;
                }
                return false;
            }
        };

        System.out.println("Odd numbers list : " + filter(source, oddPredicate));





    }

    public static <T> List<Integer> filter(List<Integer> source, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for(Integer s : source) {
            if(predicate.test(s)){
                result.add(s);
            }
        }
        return result;
    }
}
