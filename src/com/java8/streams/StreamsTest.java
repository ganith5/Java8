package com.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by pavithraabhishek on 4/29/17.
 */

class Transaction {
	String type;
	long id;
	double value;
	public Transaction(long id, String type, double value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [type=" + type + ", id=" + id + ", value=" + value + "]\n";
	}
	
	
	
	
}

public class StreamsTest {
	
	static List<Transaction> tranList = new ArrayList<Transaction>();
	
	static {
		
		tranList.add(new Transaction(101, "ELECTRICITY", 75.00));
		tranList.add(new Transaction(102, "GROCERY", 50.43));
		tranList.add(new Transaction(103, "TELEPHONE", 65.98));
		tranList.add(new Transaction(104, "CABLE", 35.00));
		tranList.add(new Transaction(105, "GROCERY", 100));
		tranList.add(new Transaction(100, "GROCERY", 100.98));
		tranList.add(new Transaction(106, "GROCERY", 10.90));
		tranList.add(new Transaction(107, "NETFLIX", 7.99));
		tranList.add(new Transaction(108, "BOOKS", 29.99));
		tranList.add(new Transaction(109, "AMAZON", 54.29));
		tranList.add(new Transaction(110, "GROCERY", 65.00));
	}
    public static void main(String[] args) {
    	System.out.println(
    			tranList.parallelStream().filter(t -> t.getType().equals("GROCERY"))
    			.sorted(comparing().reversed()).map(Transaction::toString)
    			.collect(Collectors.toList()));
    	
    	double cost = tranList.stream()
    			.filter(t -> t.getType().equals("GROCERY"))
    			.map(Transaction::getValue).reduce(0.0, (a, b) -> a + b);
    	cost = tranList.stream().filter(t -> t.getType().equals("GROCERY")).mapToDouble(Transaction::getValue).sum();
    	System.out.println("Grocery Cost : " + cost);
    	
    	double maxCost = tranList.stream().mapToDouble(Transaction::getValue).max().getAsDouble();
    	System.out.println("Max Cost : " + maxCost);
    }
    
	private static Comparator<Transaction> comparing() {
		Comparator<Transaction> byTransactionValue = (e1, e2) -> Double.compare(e1.getValue(), e2.getValue());
		return byTransactionValue;
	}
    
    
}
