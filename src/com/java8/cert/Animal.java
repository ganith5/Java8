package com.java8.cert;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	public List<Integer> move(String how) {
		System.out.println("How do animals move");
		return new ArrayList();
	}

}

class Dog extends Animal {
	
	public ArrayList<Integer> move(String how) {
		return new ArrayList<Integer>();
	}
}
