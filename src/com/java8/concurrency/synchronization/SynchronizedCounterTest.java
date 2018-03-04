package com.java8.concurrency.synchronization;

/**
 * Created by Pavithra Sachidananda on 11/26/17.
 */

public class SynchronizedCounterTest {



    public static void main(String[] args) {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        Runnable first = () -> {
            synchronizedCounter.increment();
            System.out.println ("First thread : C = " + synchronizedCounter.getValue());
        };

        Runnable second = () -> {
            synchronizedCounter.increment();
            System.out.println("Second thread : C = " + synchronizedCounter.getValue());
        };

        Thread thread = new Thread(first);
        thread.start();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        thread = new Thread(second);
        thread.start();

    }

    static class SynchronizedCounter {
        private int c = 0;

        public  synchronized void increment() {
            System.out.println("Incrementing....");
            c++;
        }

        public synchronized void decrement() {
            System.out.println("Decrementing....");
            c--;
        }

        public synchronized int getValue() {
            System.out.println("get value....");
            return c;
        }
    }
}
