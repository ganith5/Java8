package com.java8.concurrency;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by pavithraabhishek on 5/9/17.
 */
public class MyTimerTask extends TimerTask {
    Timer timer;
    private int count = 0;

    MyTimerTask(Timer timer) {
        this.timer = timer;

    }


    @Override
    public void run() {
        if(count >= 10) {
            timer.cancel();
        } else {
            System.out.println("Hello! " + (count + 1));
            count++;
        }



        //throw new RuntimeException();


    }

}
