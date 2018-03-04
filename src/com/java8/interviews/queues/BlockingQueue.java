package com.java8.interviews.queues;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Pavithra Sachidananda on 1/4/18.
 */
public class BlockingQueue<E> {

    private List<E> queue = new LinkedList();

    private int limit;

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(E item) throws InterruptedException{

        while(queue.size() == limit)
        {
            wait();
        }
        if(queue.size() == 0)
            notifyAll();
        this.queue.add(item);

    }

    public synchronized void dequeue() throws InterruptedException {
        while (queue.size() == 0)
            wait();
        if(queue.size() == limit)
            notifyAll();

        this.queue.remove(0);

    }

    public static void main(String[] args) {

        try{
            BlockingQueue blockingQueue = new BlockingQueue(5);
            blockingQueue.enqueue(1);
            blockingQueue.enqueue(2);
            blockingQueue.enqueue(3);
            blockingQueue.enqueue(4);
            blockingQueue.enqueue(5);
            //blockingQueue.enqueue(6);

            //Thread.sleep(3000);

            blockingQueue.dequeue();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


    }
}
