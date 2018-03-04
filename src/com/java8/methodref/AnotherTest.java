package com.java8.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Pavithra Sachidananda on 11/4/17.
 */
public class AnotherTest {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2,3, 5,6,8,9,100);

        List<Boolean> booleanList = Arrays.asList(true, false, true, false);

        System.out.println(filter((i) -> i % 2 != 0, integerList)); //client defines behavior, here to check odd numbers
        System.out.println(filter((i) -> i % 2 == 0, integerList)); //client defines behavior, here to check even numbers
        //client defines behavior, here to check even numbers - using methodref
        System.out.println(filter(IntPredicatesExisting :: isEven, integerList));



    }

    private static <T> List<T> filter(Predicate<T> predicate, List<T> list){
        ArrayList<T> arrayList = new ArrayList<>();

        for(T i : list) {
            if(predicate.test(i))
                arrayList.add(i);
        }

        return arrayList;
    }
}

class IntPredicatesExisting {

    public static boolean isOdd(int n) {
        return (n % 2 !=0);
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}

class BooleanPredicate {

    public static boolean isOdd(boolean n) {
        return true;
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }
}
