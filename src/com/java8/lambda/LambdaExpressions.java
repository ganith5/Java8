package com.java8.lambda;

import java.util.function.BooleanSupplier;

/**
 * Created by pavithraabhishek on 4/26/17.
 */
public class LambdaExpressions {

    public static void main(String[] args) {

        MyIntegerCalculator myIntegerCalculator = (int a) -> a * 2;

        System.out.println(myIntegerCalculator.calCulIt(10));

        Processor processor = s -> s.length();

        System.out.println(processor.getStringLength("Pavithra"));

        BooleanSupplier bs = () -> true;

        System.out.println(bs.getAsBoolean());

        int x =0 , y = 1;

        bs = () -> { return x > y; };

        System.out.println(bs.getAsBoolean());

    }


}

@FunctionalInterface
interface MyIntegerCalculator {
    int calCulIt(int a);
}


@FunctionalInterface
interface Processor {
    int getStringLength(String s);
}
