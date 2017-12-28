package com.java8.interviews;

import com.java8.interviews.linkedlist.LinkedList;
import com.java8.interviews.stacks.ArrayStack;
import com.java8.interviews.stacks.Stacks;

/**
 * Created by Pavithra Sachidananda on 11/23/17.
 */
public class DataStructuresTest {

    public static void main(String[] args) throws Exception{
        LinkedList<Integer> llList = new LinkedList<>();
        llList.addElement(2);
        llList.addElement(3);
        llList.addElement(4);

        System.out.println(llList.getHead() + " " + llList.getHead().getNext());
        System.out.print("Size = " + llList.getSize());
        System.out.println("POP : " + llList.pop());

        Stacks<Integer> stack = new Stacks<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        System.out.println("Stack = " + stack.getTop() + "  " +stack.getTop().getNext());

        System.out.println("Pop value = " + stack.pop());

        System.out.println("After pop = " + stack.getTop() + "  " +stack.getTop().getNext());

        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        System.out.println(arrayStack);

        System.out.println("Array Stack peek : " + arrayStack.peek());
        System.out.println("Array Stack pop : " + arrayStack.pop());
        System.out.println(arrayStack);
//        System.out.println("Array Stack pop : " + arrayStack.pop());
//        System.out.println("Array Stack peek : " + arrayStack.peek());
    }
}
