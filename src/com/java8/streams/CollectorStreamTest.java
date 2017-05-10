package com.java8.streams;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * Created by pavithraabhishek on 4/30/17.
 */
public class CollectorStreamTest {

    public static void main(String[] args) {

        List<Person> filtered = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toList());

        System.out.println(filtered);

        Set<Person> filteredSet = persons.stream().filter(p -> p.name.startsWith("P")).collect(Collectors.toSet());
        System.out.println(filteredSet);

        //Grouping By age

        Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.age));

        personsByAge.forEach((age, p) -> System.out.format("age : %s , name: %s \n", age, p)) ;

        //averaging age

        System.out.println("Average : " + persons.stream().collect(Collectors.averagingInt(p -> p.age)));

        //statistics
        IntSummaryStatistics intSummaryStatistics = persons.stream().collect(Collectors.summarizingInt(p -> p.age));
        System.out.println("Statistics : " + intSummaryStatistics);

        //Convert to phrase

        String phrase = persons.stream()
                .filter(p -> p.age >=18)
                .map(p -> p.name)
                .collect(Collectors.joining(" and ", "In Germany ", " are of legal age"));
        System.out.println(phrase);



        Map<Integer, String> map = persons.stream().collect(Collectors.toMap(
                p -> p.age,
                p -> p.name, (name1, name2) -> name1 + "-" + name2)
        );

        System.out.println(map);

    }

    public static List<Person> persons = Arrays.asList(
            new Person("Max", 18),
            new Person("Peter", 23),
            new Person("Pamela", 23),
            new Person("David", 12),
            new Person("Goliath", 23),
            new Person("John", 29)
    );
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
