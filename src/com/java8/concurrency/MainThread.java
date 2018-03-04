package com.java8.concurrency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavithraabhishek on 5/7/17.
 */
public class MainThread {
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 0; i < 5; i++) {
            Runnable task = new MyRunnable(10L + i);
            Thread worker = new Thread(task);
            // We can set the name of the thread
            worker.setName(String.valueOf(i));
            // Start the thread, never call method run() direct
            worker.start();
            worker.start();
            // Remember the thread for later usage
            threads.add(worker);
        }
        int running;
        do {
            running = 0;
            for (Thread thread : threads) {
                if (thread.isAlive()) {
                    running++;
                }
            }
            System.out.println("We have " + running + " running threads. ");
        } while (running > 0);
    }
}
