package com.java8.interviews.sorting.person;

import java.util.Date;

/**
 * Created by Pavithra Sachidananda on 12/6/17.
 */
public class Person implements Comparable{

    private int personId;

    private String name;

    private Date dob;

    Person(int id, String name) {
        this.personId = id;
        this.name = name;

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person)o;
        return this.getDob().compareTo(person.getDob());
    }

    @Override
    public String toString() {
        return this.personId + " : " + this.name;
    }


}
