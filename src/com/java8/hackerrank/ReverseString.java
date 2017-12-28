package com.java8.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Pavithra Sachidananda on 12/3/17.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr  = scanner.nextLine();
        int startIndex = inputStr.length() - 1;
        StringBuilder builder = new StringBuilder("");
        for (int i = startIndex; i >= 0; i--) {
            builder.append(inputStr.charAt(i));

        }

        System.out.println(builder.toString());

        reverse(inputStr);

        isPalindrome(inputStr);

    }

    private static void isPalindrome(String inputStr) {
        String reverse = reverse(inputStr);
        if(inputStr.equals(reverse))
            System.out.println("Palindrome");
    }

    private static String reverse(String inputStr) {

        char[] chars = inputStr.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        for (;left <= right; left++) {
            char temp = chars[right];
            chars[right] = chars[left];
            chars[left] = temp;
            right--;
        }

        String reverseStr = new String(chars);
        System.out.println(reverseStr);
        return reverseStr;
    }
}
