package com.java8.interviews.stacks;


/**
 * Created by Pavithra Sachidananda on 11/24/17.
 */
public class ArrayStack<E> {

    private E[] array;
    private int topIndex = -1;

    private int size = 0;

    private int MAX_SIZE;

    public boolean isFull() {
        return (size == MAX_SIZE) ? true : false;
    }

    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    public ArrayStack(int stackSize) {

        array = (E[]) new Object[stackSize] ;
        this.MAX_SIZE = stackSize;

    }

    public void push(E data) throws StackOverFlowException{
        //Collections.synchronizedList(new ArrayList<>());
        if(isFull()) {
            throw new StackOverFlowException("Stack is already full.");
        }
        array[++topIndex] = data;
        size++;

    }

    public E pop() throws StackOverFlowException{
        if(isEmpty()) {
            throw new StackOverFlowException("Stack is empty!");
        }
        E toBePoppedElement = array[topIndex];
        array[topIndex--] = null;
        size--;
        return toBePoppedElement;
    }

    public E peek() {
        return array[topIndex];
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = topIndex; i >= 0; i--) {
            stringBuilder.append(array[i]).append(" , ");
        }
        return stringBuilder.toString();
    }
}
