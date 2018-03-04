package com.java8.lambda;

import java.util.*;

public class DeveloperTest {

    static Comparator<Developer> comparator = (Developer d1, Developer d2) -> d1.getName().compareTo(d2.getName());

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Developer> developerList = createDeveloperList();

       // comparator.reversed();
        Collections.sort(developerList, comparator);

        System.out.println("Name: " + developerList);

        /**
         * No need to declare the parameter type in lambda expressions
         */

        Collections.sort(developerList, ( d1,  d2) -> d1.getAge() - d2.getAge());

        int i = Collections
                .binarySearch(
                        developerList,
                        new Developer("Arin", 19), (d1, d2) -> d2.getName().compareTo(d1.getName()));
        System.out.println(i);

        System.out.println("Age: " + developerList);


    }



    public static List<Developer> createDeveloperList() {
        List<Developer> developerList = new ArrayList<>();
        developerList.add(new Developer("Arin", 19));
        developerList.add(new Developer("Zara", 29));
        developerList.add(new Developer("Jcrew", 20));
        developerList.add(new Developer("Jack", 42));
        return developerList;
    }
}



