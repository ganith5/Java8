package com.java8.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.logging.Logger;

/**
 * Created by pavithraabhishek on 5/4/17.
 */
public class CustomRecursiveAction extends RecursiveAction {

    private String workload = "";
    private static int THRESHOLD = 4;

    private static Logger logger =
            Logger.getAnonymousLogger();

    public CustomRecursiveAction(String workload) {
        this.workload = workload;
    }


    @Override
    protected void compute() {

        if(workload.length() > THRESHOLD) {
            ForkJoinTask.invokeAll(createSubTasks());
        } else {
            processing(workload);
        }

    }

    private List<CustomRecursiveAction> createSubTasks() {
        List<CustomRecursiveAction> subTasks = new ArrayList<>();

        String partOne = workload.substring(0, workload.length()/2);
        String partTwo = workload.substring(workload.length() / 2, workload.length() );

        subTasks.add(new CustomRecursiveAction(partOne));
        subTasks.add(new CustomRecursiveAction(partTwo));

        return subTasks;
    }

    private void processing(String workload) {
        String result = workload.toUpperCase();
        logger.info("This result - " + result + " was procesed by " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        CustomRecursiveAction customRecursiveAction = new CustomRecursiveAction("HelloWorld");
        customRecursiveAction.compute();
    }
}
