package com.java8.interviews;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		String str1 = "LISTEN";
		String str2 = "SILENT";
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		
		if(new String(arr1).equals(new String(arr2))) {
			System.out.println("is anagram");
		}

	}

}
