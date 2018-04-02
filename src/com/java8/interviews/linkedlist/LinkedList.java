package com.java8.interviews.linkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavithra Sachidananda on 11/23/17.
 */
public class LinkedList<T>
{

    private SingleNode head = null;

    public LinkedList() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    //O(N)
    public void addElement(T data) {

        if(head == null) {
            head = new SingleNode(data);
            //prevNode = head;
        }
        else {
            SingleNode currNode = head;
            while(currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(new SingleNode<T>(data));

        }


    }
    //O(1)
    public T pop() {
        if(head == null){
            return null;
        } else {
            SingleNode<T> topElement = head;
            head = head.getNext();
            return topElement.getData();
        }
    }

    public T findElement(T data) {
        return null;
    }

    //O(N) complexity, because the whole linked list has to be traversed before getting the size.
    public int getSize(){
        if(head == null)
            return 0;
        else{
            SingleNode<T> currNode = head;
            int count = 0;
            while (currNode != null) {
                currNode = currNode.getNext();
                count++;
            }
            List l = new ArrayList();
            l.add(2);
            return count;
        }




    }

    public SingleNode getHead() {
        return head;
    }


    public class SingleNode<T> implements Comparable<T> {

        private T data;
        private SingleNode<T> next;

        public SingleNode(T data) {
            this.data = data;
            setNext(null);
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public SingleNode getNext() {
            return next;
        }

        public void setNext(SingleNode next) {
            this.next = next;
        }

        @Override
        public int compareTo(T o) {
            return 0;
        }

        @Override
        public String toString() {
            return "SingleNode{" +
                    "data=" + data +
                    '}';
        }
    }
}
