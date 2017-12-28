package com.java8.interviews.queues;

/**
 * Created by Pavithra Sachidananda on 11/27/17.
 */
public class QueueOverflowException extends Exception {
    public QueueOverflowException(String messages) {
        super(messages);
    }

    public QueueOverflowException() {
        super();
    }
}
