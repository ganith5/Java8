package com.java8.collections;

import java.util.*;

/**
 * Created by Pavithra Sachidananda on 11/14/17.
 */
public class InterviewQuestions {

    public static void main(String[] args) {
        //long[][] ary = new long[Integer.MAX_VALUE][Integer.MAX_VALUE];


        Stack<Integer> intStack = new Stack();
        intStack.push(1);
        intStack.push(90);

        intStack.push(34);


        int searchItem = intStack.search(90);

        System.out.println(intStack);

        System.out.println(searchItem);

        System.out.println(intStack.pop());

        System.out.println(intStack);

        System.out.println(intStack.search(34));


        System.out.println("----------------- QUEUE -------------------");
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(12);
        queue.add(22);
        queue.add(32);
        queue.add(42);
        queue.add(52);
        System.out.println(queue.element()); //return 2
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.offer(32));
        System.out.println(queue.remove());
        System.out.println(queue);

        Set set = new LinkedHashSet();
        set.add(1);
        set.add(3);
        set.add(30);
        set.add(0);
        set.add(-1);
        System.out.println(set);

    }
}
