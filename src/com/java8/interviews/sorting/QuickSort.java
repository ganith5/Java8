package com.java8.interviews.sorting;

/**
 * Created by Pavithra Sachidananda on 12/27/17.
 *
 * Complexity = O(n log n)
 * Space complexity = O(n) - based on the call stack used for recursion
 * Quicker sorting alogorithm when compared to others.
 * Worse case - O(n^2)
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 2, 1, 10, 3, 7, 8, 9};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high) { //stop the sort if lower index is higher than the high index
            return;
        }

        int pivotIndex = partition(arr, low, high); // find the pivot

        quickSort(arr, low, pivotIndex - 1); //quick sort the list on either side of the pivot
        quickSort(arr, pivotIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) { //low and high specify indices which determine what portion of list we are working on.
        int pivot = arr[low]; // choose a pivot to partition the list
        int l = low;
        int h = high;
        while(l < h) { // the loop continues as long as the indices don't cross each other
            while(arr[l] <= pivot && l < h) {
                l++; //moving from either end of the list we compare each element with pivot value.

            }
            while(arr[h] > pivot) {
                h--;
            }
            if(l < h) {
                //elements larger than the pivot are swapped to after the pivot and smaller elements are moved before the element
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
            }
        }

        // swap the pivot element to the correct position in the list
        int temp = arr[h];
        arr[h] = arr[low];
        arr[low] = temp;
        Utility.print(arr);
        return h;
    }
}
