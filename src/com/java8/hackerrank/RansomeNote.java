package com.java8.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RansomeNote {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public RansomeNote(String magazine, String note) {
		magazineMap = convertArrToMap(splitString(magazine));
		noteMap = convertArrToMap(splitString(note));
	}

	private Map<String, Integer> convertArrToMap(String[] strArr) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < strArr.length; i++) {
			String s = strArr[i];
			if(map.containsKey(s)){
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		return map;
	}

	private String[] splitString(String str) {
		return str.split("\\s");
	}

	public boolean solve() {
		boolean result = true;
		Set<String> keys = noteMap.keySet();
		for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			if(!magazineMap.containsKey(key) || ((noteMap.get(key) > magazineMap.get(key)))) {
				result = false;
				break;
			} 
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		RansomeNote s = new RansomeNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
