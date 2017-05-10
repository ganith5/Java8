package com.java8.concurrency;

/**
 * Created by pavithraabhishek on 5/7/17.
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
