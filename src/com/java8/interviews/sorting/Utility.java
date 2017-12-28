package com.java8.interviews.sorting;

/**
 * Created by Pavithra Sachidananda on 12/27/17.
 */
public class Utility {

    public static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ((i == n - 1) ? "" : " "));
        }
    }
}
