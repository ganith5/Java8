package com.java8.interviews.parker;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedListNode<Integer> a = new LinkedListNode<Integer>(1);
		LinkedListNode<Integer> b = new LinkedListNode<Integer>(2);
		LinkedListNode<Integer> c = new LinkedListNode<Integer>(3);
		LinkedListNode<Integer> d = new LinkedListNode<Integer>(4);
		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(a);
		b.data = c.data;
		b.next = c.next;
		System.out.println(a);
		
		

	}

	

}
