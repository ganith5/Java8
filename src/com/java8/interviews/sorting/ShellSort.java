package com.java8.interviews.sorting;

/**
 * Created by Pavithra Sachidananda on 12/27/17.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 1, -7, 10, 3, 8 ,9};
        int[] sortedArr = shellSort(arr);
        Utility.print(sortedArr);
    }

    private static int[] shellSort(int[] arr) {
        int increment = arr.length/2;
        while(increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++ ){
                insertionSort(arr, increment, startIndex);
            }

            increment = increment/2;
        }
        return arr;
    }

    private static void insertionSort(int[] subList, int increment, int startIndex) {
        int arrLength = subList.length;
        for (int i = startIndex; i < arrLength - 1; i = i + increment) {
            for (int j = Math.min(i+increment, arrLength-1);
                j-increment >= 0;
                j = j - increment    ) {
                if(subList[j] < subList[j-increment]) {
                    int temp = subList[j-increment];
                    subList[j-increment] = subList[j];
                    subList[j] = temp;
                }else{
                    break;
                }
            }
        }
    }


}
