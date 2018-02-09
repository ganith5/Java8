package com.java8.concurrency;

/**
 * Created by Pavithra Sachidananda on 11/26/17.
 *
 * So why do we use Join ?
 * To see to it that we wait for the current thread to finish execution before the next thread picks up
 */
public class JoinTest {

    public static void main(String[] args) {

        Runnable joinRunnable = () -> {
                for (int i = 0; i < 4; i++) {
                    printMessages(Thread.currentThread().getName(), "" + i);
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
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
            thread.join();
            printMessages(Thread.currentThread().getName() , " after join " + Thread.currentThread().isAlive());
        }catch(InterruptedException ie) {
            ie.printStackTrace();
        }

        printMessages(thread.getName() , " status currently " + thread.isAlive());
        printMessages(Thread.currentThread().getName() , " status currently " + Thread.currentThread().isAlive());

//       if(thread.isAlive()) {
//            System.out.println("Thread name = " + thread.getName()
//            + "    " + Thread.currentThread().getName());
//            if(Thread.currentThread().isAlive()) {
//                System.out.println("Main is alive");
//            }
//            else {
//                System.out.println("Main is dead");
//            }
//       } else {
//            System.out.println(Thread.currentThread().isAlive());
//           System.out.println("Thread name = " + " is dead." + thread.getName()
//                   + "    " + Thread.currentThread().getName());
//       }

    }

    private static void printMessages(String threadName, String message) {
        System.out.println("[TN] :: " + threadName + "  [status] :: " + message);
    }


}
