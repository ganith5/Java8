package com.java8.interviews.sorting;

/**
 * Created by Pavithra Sachidananda on 12/4/17.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 1, 7, 10, 3, 8 ,9};
        int[] sortedArr = bubbleSort(arr);
        print(sortedArr);
    }

    private static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean swap = false;
            for (int j = 0; j < (len -1); j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }

            }
            if(!swap){
                break;
            }

        }

        return arr;
    }

    private static void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ((i == n - 1) ? "" : " "));
        }
    }
}
