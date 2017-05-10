package com.java8.methodref;

import java.time.LocalDate;

/**
 * Created by pavithraabhishek on 4/27/17.
 */
public class Person {

    Person(String name, LocalDate bDay, SEX gender, String emailAddress) {
        this.name = name;
        this.birthday = bDay;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public enum SEX  {MALE, FEMALE};

    String name;

    LocalDate birthday;

    SEX gender;

    String emailAddress;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public SEX getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }


    public static int compareByAge(Person p1, Person p2) {
        return p1.getBirthday().compareTo(p2.getBirthday());
    }

    @Override
    public String toString() {
        return "Name : " + name + " birthday : " + birthday + " Gender : " + gender + " email : " + emailAddress;
    }
}
