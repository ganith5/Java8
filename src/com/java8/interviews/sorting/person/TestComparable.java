package com.java8.interviews.sorting.person;

import javafx.collections.transformation.SortedList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Pavithra Sachidananda on 12/6/17.
 */
public class TestComparable {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        try {
            Person person1 = new Person(1, "P1");
            //Dec 1, 2015
            person1.setDob(dateFormat.parse("12/01/2015"));

            Person person2 = new Person(2, "P2");
            //Dec 12, 2016
            person2.setDob(dateFormat.parse("12/12/2016"));

            Person person3 = new Person(3, "P3");
            //Nov 12, 2016
            person3.setDob(dateFormat.parse("11/12/2016"));

            List<Person> arrayList = new ArrayList<>(); //No sorting
            arrayList.add(person1);
            arrayList.add(person2);
            arrayList.add(person3);

            System.out.println("no sorting : " + arrayList);
            arrayList.sort(new PersonComparator());
            System.out.println("sorting {comparator} : " + arrayList);

            Collections.sort(arrayList); //explicit sorting using Comparable
            for (Person person : arrayList) {
                System.out.println(person);
            }

            TreeSet<Person> treeSet = new TreeSet<>(); //Treeset orders on insertion
            treeSet.add(person1);
            treeSet.add(person2);
            treeSet.add(person3);
            System.out.println("sorting with SET {natural sorting, comparable interface} : " + treeSet);
            Iterator<Person> iterator = treeSet.descendingIterator();
            while (iterator.hasNext()){
                Person person = iterator.next();
                System.out.println("TS sorting DESC : " + person);
            }


            Set<Person> set = new HashSet();
            set.add(person1);
            set.add(person2);
            set.add(person3);
            // no guarantee of insertion order
            System.out.println("sorting with SET {natural sorting, comparable interface} : " + set);

            set = new LinkedHashSet<>();
            set.add(person1);set.add(person2); set.add(person3);
            System.out.println("sorting with LINKEDHASHSET : " + set);

            new StringBuilder().reverse();

        }catch (ParseException pe) {
            pe.printStackTrace();
        }





    }
}
