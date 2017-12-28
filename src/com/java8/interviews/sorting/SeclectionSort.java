package com.java8.interviews.sorting;

/**
 * Created by Pavithra Sachidananda on 12/3/17.
 */
public class SeclectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 1, 7, 10, 3, 8 ,9};
        int[] sortedArr = selectionSort(arr);
        print(sortedArr);

    }

    private static int[] selectionSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println(count);
        return arr;
    }


    private static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ((i == n - 1) ? "" : " "));
        }
    }
}
