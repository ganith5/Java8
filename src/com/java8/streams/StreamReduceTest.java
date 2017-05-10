package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by pavithraabhishek on 5/3/17.
 */
public class StreamReduceTest {

    public static void main(String[] args) {

       Optional<Person1> person1Optional = persons.stream().reduce((p1, p2) -> p1.age > p2.age ? p1 : p2);
       person1Optional.ifPresent(p -> System.out.println(p));


       Person1 result = persons.stream().reduce(new Person1("", 20), (p1, p2) -> {
           p1.age += p2.age;
           p1.name += p2.name;
           return p1;
       });

       System.out.println("Result = " + result.name + "   " + result.age);

       Integer ageSum = persons.stream().reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);
       System.out.println("Age Sum = " + ageSum);

    }

    static List<Person1> persons =
            Arrays.asList(
                    new Person1("Max", 18),
                    new Person1("Peter", 23),
                    new Person1("Pamela", 23),
                    new Person1("David", 12));
}

class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}


