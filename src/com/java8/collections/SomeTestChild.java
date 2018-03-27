package com.java8.collections;

/**
 * Created by Pavithra Sachidananda on 11/14/17.
 */
public class SomeTestChild extends Thread {

    public static void main(String[] args) {
        SomeTestChild someTestChild = new SomeTestChild();
        someTestChild.run();


        Runnable runnable = () -> System.out.println("runnable");

        runnable.run();

        Runnable runnable1 = () -> System.out.print("Abc");
        runnable1.run();
    }

}
