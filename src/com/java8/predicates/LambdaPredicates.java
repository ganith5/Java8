package com.java8.predicates;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by pavithraabhishek on 4/27/17.
 */
public class LambdaPredicates {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println("Value = " + predicate.test("Pavithra"));

        IntPredicate intPredicate = i -> i > 5;
        IntPredicate intPredicate1 = j -> j < 0;
        System.out.println("Int Predicate = " + intPredicate.test(1));
        System.out.println("Int Predicate1 = " + intPredicate1.test(1));
        System.out.println("Int Predicate OR = " + intPredicate.and(intPredicate1).test(-1));
    }
}
