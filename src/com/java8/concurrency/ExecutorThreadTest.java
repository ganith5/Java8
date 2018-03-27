package com.java8.concurrency;

import java.util.concurrent.*;

/**
 * Created by pavithraabhishek on 5/7/17.
 *
 * ExecutorService is an interface that allows tasks to be executed asynchronously.
 * Its similar to ThreadPool , so tasks are submitted to the service, and the tasks are executed when threads in the
 * service are free to execute
 */
public class ExecutorThreadTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(() -> {
            System.out.println("Asynchronous task");
            for (int i = 0; i < 10; i++) {
                System.out.println("i : " + i);
            }});

        Future future = executorService.submit(() -> System.out.println("Asynchronous task"));

        try {
            System.out.println("Future value " + future.get());
            //if NULL returned means the future task has completed execution
        } catch (InterruptedException | ExecutionException e) {
           e.printStackTrace();
        }

        Future callableFuture = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable returned a string";
            }
        });

        try {
            System.out.println("Future value " + callableFuture.get());
            //Here since callable was added to ExecutorService, once the callable is executed, it returns a value
            // The value is returned when future.get() is called.
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


        //System.out.println("Main thread");
        //If shutdown is not called , the executor service wil continue to run
        // the active threads in the executorservice prevent the JVM from killing the service.
        executorService.shutdown();

        /**
         * Here the @Callable or Runnable is executed after the specified time.
         */
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

        ScheduledFuture scheduledFuture = scheduledExecutorService.schedule(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 9;
            }
        }, 15, TimeUnit.SECONDS);

        try {
            System.out.println("Scheduled future value " + scheduledFuture.get());
            //Here since callable was added to ExecutorService, once the callable is executed, it returns a value
            // The value is returned when future.get() is called.
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        scheduledExecutorService.shutdown();



    }
}
