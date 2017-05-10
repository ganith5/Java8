package com.java8.optional;

import java.util.Optional;

/**
 * Created by pavithraabhishek on 5/3/17.
 */
public class OptionalBasicTest {

    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Optional non-null = "+ gender);
        System.out.println("Optional non-null get() = "+ gender.get());
        System.out.println("Optional empty = " + Optional.empty());
        System.out.println("Optional answer1 = " + Optional.of(answer1));

        System.out.println("Optional nullable answer1 = " + Optional.ofNullable(answer1));
        System.out.println("Optional nullable answer2 = " + Optional.ofNullable(answer2));

       // System.out.println("Optional empty answer2 = " + Optional.of(answer2));

        gender.ifPresent(g -> System.out.println("Gender value is present"));
        Optional<String> emptyGender = Optional.empty();
        emptyGender.ifPresent(e -> System.out.println("Gender value is present : should not print"));

        System.out.println(gender.orElseGet(() -> "N/A")); //prints default value if actual is not present
        System.out.println(emptyGender.orElseGet(() -> "N/A")); //prints default value if actual is not present


    }
}
