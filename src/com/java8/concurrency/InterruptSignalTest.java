package com.java8.concurrency;

/**
 * Created by Pavithra Sachidananda on 11/26/17.
 */
@SuppressWarnings("Duplicates")
public class InterruptSignalTest {



    public static void main(String[] args) {

        Runnable joinRunnable = () -> {
            for (int i = 0; i < 4; i++) {
                printMessages(Thread.currentThread().getName(), "" + i);
                try {
                    Thread.sleep(2000);
                    if(Thread.currentThread().isInterrupted()) {
                        printMessages(Thread.currentThread().getName() , " is interrupted");
                    }
                } catch (InterruptedException e) {
                    //when main thread interrupts this exception is thrown.
                    //Since I say when joinRunnable is interrupted , return, the loop is no more executed.
                    e.printStackTrace();
                    return; //if return is removed, the loop executes after main thread finishes execution.
                }
            }
        };
//JoinRunnable is started
        Thread thread = new Thread(joinRunnable, "joinThread");
        thread.start();

        try{

            printMessages(Thread.currentThread().getName() , " before join " + Thread.currentThread().isAlive());
            //join() is called on joinRunnable, so the main thread wait for joinRunnable to finish before completing its execution
            //Comment join() to see what happens is join is not called. Main thread continues its execution simutaenously when
            //joinRunnable is executing.
            thread.join(3000); // at 3s, the joinRunnable will pass control to main thread.
            //the main thread will interrupt the joinRunnable, hence a InterruptedException is thrown.

            thread.interrupt();

            printMessages(Thread.currentThread().getName() , " after join " + Thread.currentThread().isAlive());
        }catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        printMessages(thread.getName() , " status currently " + thread.isAlive());
        printMessages(Thread.currentThread().getName() , " status currently " + Thread.currentThread().isAlive());



    }

    private static void printMessages(String threadName, String message) {
        System.out.println("[TN] :: " + threadName + "  [status] :: " + message);
    }
}
