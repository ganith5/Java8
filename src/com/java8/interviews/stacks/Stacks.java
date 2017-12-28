package com.java8.interviews.stacks;

/**
 * Created by Pavithra Sachidananda on 11/24/17.
 */
public class Stacks<T> {

    private Element<T> top;

    private final int MAX_SIZE = 10;

    private int size;

    public int getSize() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0 ? true : false;
    }

    private boolean isFull() {
        return size == MAX_SIZE ? true : false;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Stacks() {

    }

    public Element<T> getTop() {
        return top;
    }

    public void setTop(Element<T> top) {
        this.top = top;
    }

    //O(1)
    public void push(T data) throws StackOverFlowException{
        if(size == MAX_SIZE)
            throw new StackOverFlowException();

       Element<T> element = new Element<>(data, top);
       top = element;
       size++;


    }

    //O(1)
    public T peek() throws StackOverFlowException{
        if(size == 0)
            throw new StackOverFlowException("Empty stack, nothing to peek!");
        return top.getData();


    }

    //O(1)
    public T pop() throws StackOverFlowException{

        if(size == 0)
            throw new StackOverFlowException("Stack is empty");
        Element<T> element = top.getNext();
        top = element;
        return element.getData();

    }


    public class Element<T> {

        private T data;

        private Element<T> next;

        public Element(T data, Element next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Element<T> getNext() {
            return next;
        }

        public void setNext(Element<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
             return "SingleNode{" +
                    "data=" + data +
                    '}';
        }
    }
}
