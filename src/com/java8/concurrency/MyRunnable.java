package com.java8.concurrency;

/**
 * Created by pavithraabhishek on 5/7/17.
 *
 * Runnable is an interface that has a method run(). The run() method has the task that
 * should be executed by Thread. The Runnable is passed into the constructor of Thread.
 * Runnable is a preferred method because the Runnable object can subclass from classes other than Thread.
 *
 */
public class MyRunnable implements Runnable {
    long countTill = 0L;

    MyRunnable(long count) {
        this.countTill = count;
    }


    @Override
    public void run() {
        long sum = 0;
        for(int i=0; i<countTill;i++) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }


}
