package com.java8.concurrency.synchronization;

/**
 * Created by Pavithra Sachidananda on 11/26/17.
 */
public class SynchronizedCounter {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }
}
