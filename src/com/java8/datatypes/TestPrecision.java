package com.java8.datatypes;

import java.math.BigDecimal;

public class TestPrecision {

	public static void main(String[] args) {
		
		double a = 0.02;
		double b = 0.03;
		double c = b - a;
		System.out.println("double sum : " + c);
		
		BigDecimal bd1 = new BigDecimal("0.02");
		BigDecimal bd2 = new BigDecimal("0.03");
		BigDecimal result = bd2.subtract(bd1);
		System.out.println(result);

	}

}
