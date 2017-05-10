package com.java8.methodref;

/**
 * Created by pavithraabhishek on 4/27/17.
 */
public class ComparisonProvider {

    public int compareByName(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }

    public int compareByAge(Person p1, Person p2) {
        return p1.getBirthday().compareTo(p2.getBirthday());
    }
}
