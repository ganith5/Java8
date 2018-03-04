package com.java8.concurrency;

/**
 * Created by Pavithra Sachidananda on 11/25/17.
 */
public class SleepTest {

    public static void main(String[] args) throws InterruptedException{
        String[] messages = {"Hello", "world", "from", "me"};

        for (int i = 0; i < 4; i++) {

            /**
             * sleep() - thread sleeps for the specified time
             */
            Thread.sleep(4000);


            System.out.println(messages[i]);

        }

    }
}
