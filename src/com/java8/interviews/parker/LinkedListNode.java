package com.java8.interviews.parker;

public class LinkedListNode<T> {

	public T data;
	public LinkedListNode<T> next;
	private LinkedListNode<T> head;
	
	
	public LinkedListNode(T data) {
		this.data = data;
		setNext(null);
	}
	
	private void setNext(LinkedListNode<T> next) {
		this.next = next;
		
	}

	public void add(T data) {
		if(head == null) {
			head = new LinkedListNode<T>(data);
			head.next = null;
			
		} else {
			LinkedListNode<T> node = new LinkedListNode<T>(data);
			
		}
	}
	
	public T getData() {
		return data;
	}
	
	public LinkedListNode<T> getNext() {
		return this.next;
	}
	
	public void deleteNode(LinkedListNode<T> node) {
		
	}
	
	@Override
	public String toString() {
		
		return ""+this.data + "-" + this.next;
	}
}
