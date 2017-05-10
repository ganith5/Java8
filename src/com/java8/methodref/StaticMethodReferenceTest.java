package com.java8.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by pavithraabhishek on 4/25/17.
 */
public class StaticMethodReferenceTest {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(filter(IntPredicates :: isOdd, list));
        System.out.println(filter(IntPredicates :: isEven, list));

        for(int l : list) {
            Predicate<Integer> isOdd = a -> IntPredicates.isOdd(a);
            System.out.println(isOdd);
        }

        System.out.println("Without static method ref = " + Integer.toBinaryString(10));
        //Lambda

        Function<Integer, String> function = x -> Integer.toBinaryString(x);
        System.out.println("Lambda : " + function.apply(10));

        function = Integer :: toBinaryString;
        System.out.println("Static method ref = " + function.apply(11));




    }


    static <T> List<T> filter(Predicate<T> predicate, List<T> source) {
        List<T> destiny = new ArrayList<T>();

        for(T item : source) {
            if (predicate.test(item)) {

                destiny.add(item);
            }
        }
        return destiny;
    }



}

class IntPredicates {

    public static boolean isOdd(int n) {
        return (n % 2 !=0);
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}


