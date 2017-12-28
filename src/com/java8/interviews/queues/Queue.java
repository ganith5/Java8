package com.java8.interviews.queues;

import com.java8.interviews.stacks.StackOverFlowException;

import java.lang.reflect.Array;

/**
 * Created by Pavithra Sachidananda on 11/27/17.
 */
public class Queue<T> {

    private static final int MAX_SIZE = 5;
    private T[] elements;

    private static final int NEGATIVE_INDEX = -1;

    private int head = NEGATIVE_INDEX;
    private int tail = NEGATIVE_INDEX;

    public Queue(Class<T> clazz) {

        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);

    }

    //O(1)
    public boolean isFull() {
        return ((tail + 1) == MAX_SIZE);
    }

    //O(1)
    public boolean isEmpty() {

        return (head == NEGATIVE_INDEX);
    }

    //O(1) - not performing any complex operation that needs the size of the input
    public void enqueue(T data) throws QueueOverflowException{

        if(isFull()) {
            throw new QueueOverflowException("The queue is already full.");
        }

        tail = (tail + 1) % elements.length;
        elements[tail] = data;

        if(head == NEGATIVE_INDEX)
            head = head + 1;

    }

    //O(1)
    public T dequeue() throws QueueOverflowException {
        if(isEmpty())
            throw new QueueOverflowException("Stack is empty!");
        T data = elements[head];

        if(head == tail)
            head = NEGATIVE_INDEX;
        else
            head = (head + 1) % elements.length;


        return data;

    }




    public static void main(String[] args) {
        Queue queue = new Queue(Character.class);
        try {
            queue.enqueue('a');
            queue.enqueue('b');
            queue.enqueue('c');
            queue.enqueue('d');
            queue.enqueue('e');

            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();
            queue.dequeue();

        } catch (QueueOverflowException e) {
            e.printStackTrace();
        }

        System.out.println(queue.elements);
    }
}
