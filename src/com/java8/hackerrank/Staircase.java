package com.java8.hackerrank;

import java.util.Scanner;

public class Staircase {

	static String SYMBOL = "#";
	static String SPACE = " ";
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
	}

	private static void staircase(int n) {
		StringBuilder builder = new StringBuilder("");
		for(int i=1; i<=n; i++) {
			int spaces = n - i;
			for(int j=1; j<=n; j++) {
				if(j <= spaces)
				builder.append(SPACE);
				else
					builder.append(SYMBOL);
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}

}
