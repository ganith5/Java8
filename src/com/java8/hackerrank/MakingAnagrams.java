package com.java8.hackerrank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Two words are anagrams if both words have the same letters and in the same
 * frequency
 * 
 * @author cg100180
 *
 */
public class MakingAnagrams {

	private static final int NUMBER_CHARACTERS = 26;

	public static int numberNeeded(String first, String second) {
		int result = 0;
		Map<Character, Integer> firstCharFrequency = new HashMap<Character, Integer>();
		Map<Character, Integer> secondCharFrequency = new HashMap<Character, Integer>();
		int len1 = first.length();
		for (int i = 0; i < len1; i++) {
			if (firstCharFrequency.containsKey(first.charAt(i))) {

				firstCharFrequency.put(first.charAt(i), firstCharFrequency.get(first.charAt(i)) + 1);

			} else {
				firstCharFrequency.put(first.charAt(i), 1);

			}
			result++;
		}
		int len2 = second.length();
		for (int i = 0; i < len2; i++) {
			if (firstCharFrequency.containsKey(second.charAt(i))) {
				result--;
				if (firstCharFrequency.get(second.charAt(i)) - 1 == 0) {
					firstCharFrequency.remove(second.charAt(i));
				} else {
					firstCharFrequency.put(second.charAt(i), firstCharFrequency.get(second.charAt(i)) - 1);
				}

			} else if (secondCharFrequency.containsKey(second.charAt(i))) {
				result++;
				secondCharFrequency.put(second.charAt(i), secondCharFrequency.get(second.charAt(i)) + 1);

			} else {
				result++;
				secondCharFrequency.put(second.charAt(i), 1);

			}

		}

		return result;
	}

	public static int advNumberNeeded(String first, String second) {
		int[] charCount1 = getCharCount(first);
		int[] charCount2 = getCharCount(second);
		return delta(charCount1, charCount2);
	}

	private static int delta(int[] charCount1, int[] charCount2) {
		int delta = 0;
		if (charCount1.length != charCount2.length) {
			throw new IllegalArgumentException();
		} else {
			for (int i = 0; i < charCount1.length; i++) {
				int difference = Math.abs(charCount1[i] - charCount2[i]);
				delta += difference;
			}
		}
		return delta;
	}

	private static int[] getCharCount(String str) {
		int[] charCount = new int[NUMBER_CHARACTERS];
		for (int i = 0; i < str.length(); i++) {
			int offset = 'a';
			char c = str.charAt(i);
			int code = c - offset;
			charCount[code]++;
		}
		return charCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));

	}

}
