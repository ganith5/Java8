package com.java8.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Sherlock {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = isValid(s);
		System.out.println(result);
	}

	static String isValid(String s) {
		String result = "YES";

		Map<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (charFreqMap.containsKey(c)) {
				
				charFreqMap.put(c, charFreqMap.get(c) + 1);
			} else {
				
				charFreqMap.put(c, 1);
			}

		}
		
		/*int prevFreq = 0, currFreq = 0, diff = 0;
		List<Integer> frequencyValues = new ArrayList<Integer>(charFreqMap.values());
		for(int i =0; i<frequencyValues.size(); i++) {
			currFreq = frequencyValues.get(i);
			if(i == 0) {
				prevFreq = currFreq;
			}
			if(prevFreq == currFreq) {
				prevFreq = currFreq;
			} else {
				diff = diff + Math.abs(currFreq - prevFreq);
			}
		}
		
		if(diff == 0 || diff == 1)
			return "YES";
		else
			return "NO";*/
		
		
		int prevFreq = 0, count = 0, currFreq = 0;
		boolean removed = false;
		Set<Map.Entry<Character, Integer>> mapSet = charFreqMap.entrySet();
		for (Iterator iterator = mapSet.iterator(); iterator.hasNext();) {
			Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) iterator.next();
			currFreq = entry.getValue();
			if (count == 0) {
				prevFreq = currFreq;
				count++;
			}

			if (currFreq != prevFreq) {
				if (!removed) {
					if (currFreq - 1 == 0) {
						removed = true;
					} else if (currFreq - 1 == prevFreq) {
						removed = true;
					} else {
						result = "NO";
					}
				} else {
					result = "NO";
					break;
				}

			}

		}
		return result;
	}

}
