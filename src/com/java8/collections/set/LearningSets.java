package com.java8.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Pavithra Sachidananda on 1/7/18.
 */
public class LearningSets {

    public static void main(String[] args) {
        Set hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(3);

        System.out.println(hashSet.size());


        Set<Person> personSet = new TreeSet<>();
         Person person1 = new Person("John");

         personSet.add(person1);

         Person person2 = new Person("Katie");
         personSet.add(person2);

         person2.name = "John";

         System.out.println(personSet.size() + "  " + personSet);
    }


    static  class Person implements Comparable{


        private  String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            return this.name.equals(((Person)obj).name);
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Object o) {
            return this.name.compareTo(((Person)o).name);
        }
    }
}
