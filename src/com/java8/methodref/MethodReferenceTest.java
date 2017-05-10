package com.java8.methodref;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by pavithraabhishek on 4/27/17.
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
        /**
         * Declaring the comparator
         */

        Person person1 = new Person("Abbey", LocalDate.now(), Person.SEX.FEMALE, "xyz@gmail.com");
        Person person2 = new Person("John", LocalDate.now().plusYears(3), Person.SEX.MALE, "abc@gmail.com");
        Person person3 = new Person("Clara", LocalDate.now().plusYears(-1), Person.SEX.FEMALE, "clara@gmail.com");

        Person[] personArray = {person1, person2, person3};

        Arrays.sort(personArray, new PersonAgeComparator());

//        for(Person person : personArray ) {
//            System.out.println(person);
//        }

        /**
         * Using lambda
         */

        Arrays.sort(personArray, (Person p1, Person p2) -> {
            return p1.getBirthday().compareTo(p2.getBirthday());
        });

        /**
         * Using method reference - static method
         */

        Arrays.sort(personArray, Person :: compareByAge);

        for(Person person : personArray ) {
            System.out.println(person);
        }


        /**
         * Using method reference - using instance method
         */
        Arrays.sort(personArray, new ComparisonProvider() :: compareByName);


    }
}

class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getBirthday().compareTo(p2.getBirthday());
    }
}
