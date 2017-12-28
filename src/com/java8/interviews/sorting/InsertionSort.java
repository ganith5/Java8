package com.java8.interviews.sorting;

/**
 * Created by Pavithra Sachidananda on 12/4/17.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 1, 7, 10, 3, 8 ,9};
        int[] sortedArr = insertionSort(arr);
        Utility.print(sortedArr);
    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }


}
