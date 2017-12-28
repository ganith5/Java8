package com.java8.interviews.linkedlist;

import java.util.Iterator;

/**
 * Created by Pavithra Sachidananda on 12/18/17.
 */
public class DoublyLinkedList<E> implements Iterable{

    LinkNode<Integer> head = null;
    LinkNode<Integer> tail = null;

    public void insertFirst(Integer data) {

        LinkNode linkNode = new LinkNode(data);

        if(head == null){
            head = linkNode;
            tail = linkNode;
            //linkNode.setPrev(null);
            //linkNode.setNext(null);
        } else{
            linkNode.next = head;
            head.prev = linkNode;
            head = linkNode;
        }

    }

    public void insertLast(Integer data) {
        LinkNode linkNode = new LinkNode(data);
        if(head == null){
            head = linkNode;
            tail = linkNode;
        }else{
            LinkNode prevTail = tail;
            prevTail.next = linkNode;
            tail = linkNode;
            tail.prev = prevTail;
        }

    }

    public int getSize() {

        int count = 0;

        if(head == null)
            count = 0;
        else {
            LinkNode currentNode = head;
            while (currentNode != null) {
                currentNode = currentNode.next;
                count++;
            }
        }

        return count;
    }

    public void add(Integer data) {
        LinkNode newNode = new LinkNode(data);
        if(head == null){
            //head = newNode;
            insertFirst(data);
        } else{
            LinkNode currentNode = head;
            while(currentNode.next != null) {
                Integer intData = (Integer) currentNode.data;
                if(intData.intValue() > data.intValue()){
                    LinkNode prevNode = currentNode.prev;
                    newNode.next = currentNode;
                    if(prevNode != null)
                        prevNode.next = newNode;
                    break;
                }

                currentNode = currentNode.next;

            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }

    }

    @Override
    public Iterator iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator {

        LinkNode<Integer> current = head;

        @Override
        public boolean hasNext() {
            if(current.next != null) {
                current = current.next;
                return true;
            }

            return false;
        }

        @Override
        public Object next() {
            return current;
        }
    }


    static class LinkNode<Integer> implements Comparable{

        LinkNode(Integer data) {
            this.data = data;
        }

        private Integer data;

        private LinkNode<Integer> next;

        private LinkNode<Integer> prev;


        @Override
        public String toString() {
            return "[" + data + "]";
        }

        @Override
        public int compareTo(Object o) {
            Integer i = (Integer)o;

            return this.compareTo(i);
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<Integer>();
//        doublyLinkedList.insertFirst(3);
//        doublyLinkedList.insertFirst(5);
//        doublyLinkedList.insertLast(6);
//        doublyLinkedList.insertLast(7);
//        doublyLinkedList.insertLast(8);
//        doublyLinkedList.insertFirst(2);
//        doublyLinkedList.insertFirst(1);

        doublyLinkedList.add(3);
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);
        doublyLinkedList.add(7);
        doublyLinkedList.add(8);
        doublyLinkedList.add(2);
        doublyLinkedList.add(1);
        doublyLinkedList.add(4);




//        System.out.println(doublyLinkedList.head.prev + " |h= " + doublyLinkedList.head + " | "
//                +  doublyLinkedList.head.next + " | " + doublyLinkedList.tail.prev
//        + " |t= " + doublyLinkedList.tail + " | " + doublyLinkedList.tail.next);

        Iterator iterator = doublyLinkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(doublyLinkedList.getSize());
    }
}
