package com.java8.functional;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by pavithraabhishek on 4/29/17.
 */
public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumer = x -> {
            System.out.println("X : " + x + " Str length = " + x.length());
        };

        consumer.accept("Hello World!");

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println("Name : " + name + " Age: " + age);
        };
        biConsumer.accept("Pavi", 35);


        BiFunction<Integer, Integer, String> biFunction = (x, y) -> {
            return "Multiply : " + x * y;
        };

        Function<String, Integer> function = s -> s.length();



        System.out.println("BiFunction result" + biFunction.andThen(function).apply(8, 90));






    }
}
