package com.java8.concurrency.synchronization;

/**
 * Created by Pavithra Sachidananda on 11/27/17.
 */
public class SynchronizationLockTest {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();

        Runnable first = () -> {
            myObject.setField1(3);
        };

        Runnable second = () -> {
            myObject.setField1(4);
        };

        Thread thread = new Thread(first);
        Thread thread1 = new Thread(second);
        thread.start();thread1.start();

    }

    static class MyObject {
        private int field1;

        public int getField1() {
            return field1;
        }

        public void setField1(int field1) {
            synchronized (this) {
                this.field1 = field1;

            }
            System.out.println(field1);
        }
    }
}
