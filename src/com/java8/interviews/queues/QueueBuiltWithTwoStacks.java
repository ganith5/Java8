package com.java8.interviews.queues;

import java.util.Stack;

/**
 * Created by Pavithra Sachidananda on 11/27/17.
 */
public class QueueBuiltWithTwoStacks<T> {

    private Stack<T> forwardStack = new Stack<T>();
    private Stack<T> reverseStack = new Stack<>();

    public QueueBuiltWithTwoStacks() {

    }

    public void enqueue(T data) {
        //check if reverseStack is empty
        //if yes, add element to forwardStack
        //else, pop everyting from RS, push to FS, and then add
        //the next element

        if(reverseStack.isEmpty() && forwardStack.isEmpty())
            forwardStack.push(data);
        else {
            if(forwardStack.isEmpty()) {
                while (!reverseStack.isEmpty()) {
                    forwardStack.push(reverseStack.pop());
                }
            }
            forwardStack.push(data);

        }
    }
    
    public boolean isEmpty() {
    	return reverseStack.isEmpty() && forwardStack.isEmpty();
    }

    public T dequeue() {

        if(reverseStack.isEmpty()) {
            while (!forwardStack.isEmpty()) {
                reverseStack.push(forwardStack.pop());
            }
        }
        return reverseStack.pop();

    }
}
