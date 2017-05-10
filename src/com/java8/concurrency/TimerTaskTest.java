package com.java8.concurrency;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by pavithraabhishek on 5/9/17.
 */
public class TimerTaskTest {
    public static void main(String[] args) {

        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask(timer);

        timer.schedule(myTimerTask, 1000, 1000);



        System.out.println("Scheduled time = " + myTimerTask.scheduledExecutionTime());
    }
}
