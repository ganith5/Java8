package com.java8.functional;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by pavithraabhishek on 5/2/17.
 */
public class UnaryAndBinaryOperatorTest {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (i1) -> i1 + " - ";
        List<String> output = new ArrayList<>();
        persons.forEach(person -> output.add(unaryOperator.apply(person.name)));
        System.out.println("Output : "+ output);


        BinaryOperator<String> binaryOperator = (s, i) -> s + " - " + i;
        List<String> binaryOutput = new ArrayList<>();
        persons.forEach(person -> binaryOutput.add(binaryOperator.apply(person.name, person.job)));
        System.out.println("Binary Output : "+ binaryOutput);


    }


    public static List<Person> persons = Arrays.asList(
            new Person("Max", 18, "Salesperson"),
            new Person("Peter", 23, "Teacher"),
            new Person("Pamela", 23, "GroceryAssistant"),
            new Person("David", 12, "Student"),
            new Person("Goliath", 23, "Merchandiser"),
            new Person("John", 29, "Doctor")
    );
}

class Person {
    String name;
    int age;
    String job;

    Person(String name, int age, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", job=" + job + '}';
    }
}
