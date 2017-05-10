package com.java8.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Created by pavithraabhishek on 4/25/17.
 */
public class ConstructorMethodReferenceTest {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3", "4");
        List<Integer> intList = map(s -> new Integer(s),list);

        System.out.println("Lambda list : " + intList);

        intList = map(Integer :: new, list);

        System.out.println("Constructor list : " + intList);

        IntFunction<int[]> intFunction = int[] :: new;
        int[] array2 = intFunction.apply(6);
        System.out.println(Arrays.toString(array2));

    }

    //T -> argument type; R -> return type
    static <T,R> List<R> map(Function<T,R> function, List<T> source) {

        List<R> destiny = new ArrayList<R>();

        for(T item : source) {
            R value = function.apply(item);
            destiny.add(value);
        }

        return destiny;

    }
}
