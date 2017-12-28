package com.java8.interviews.sorting.person;

import java.util.Comparator;

/**
 * Created by Pavithra Sachidananda on 12/6/17.
 */
public class PersonComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        return p1.getDob().compareTo(p2.getDob());
    }
}
