package com.java8.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
	
	public class Node {
		public Node(int data) {
			this.data = data;
		}
		
		int data;
		Node next;
		
		boolean hasCycle(Node head) {
			Map<Node, Boolean> visited = new HashMap<Node, Boolean>();
		    if(head == null || head.next == null)
		        return false;
		    else {
		        Node currNode = head;
		        
		        while(currNode.next != null) {
		        	if(visited.get(currNode) != null) {
		        		return true;
		        	}
		        	visited.put(currNode, true);
		            currNode = currNode.next;
		            
		        }
		    }
		    return false;
		}
	}

	public static void main(String[] args) {
		LinkedListCycle linkedListCycle = new LinkedListCycle();
		Node one = linkedListCycle.new Node(1);
		Node two = linkedListCycle.new Node(1);
		Node three = linkedListCycle.new Node(1);
		one.next = two;
		two.next = three;
		three.next = one;
		if(!one.hasCycle(one))
			System.out.println("false");
		else
			System.out.println("true");

	}

}
