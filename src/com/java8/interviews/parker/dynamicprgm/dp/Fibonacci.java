package com.java8.interviews.parker.dynamicprgm.dp;

/**
 * Created by Pavithra Sachidananda on 12/15/17.
 * Space complexity - O(n)
 * Time complexity = O(n)
 */
public class Fibonacci {

    public static void main(String[] args) {

        fibonacci(6);
    }

    private static void fibonacci(int n) {

        int[] valueAtEachNum = new int[n+1];

        for (int i = 0; i <= n; i++) {
            if(i == 0)
                valueAtEachNum[0] = 0;
            else if(i == 1)
                valueAtEachNum[1] = 1;
            else {
                valueAtEachNum[i] = valueAtEachNum[i-1] + valueAtEachNum[i-2];
            }

        }
        System.out.print("Fibonacci = " + valueAtEachNum[n]);

    }
}
