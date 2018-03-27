package com.java8.interviews.sorting.search;

import java.util.Arrays;

/**
 * Created by Pavithra Sachidananda on 12/29/17.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] input = {99, 22, 44, 33, 77, 11, 55, 88, 66, 110};
        Arrays.sort(input);
        int searchItemIndex = binarySearch(input, 880);
        System.out.println("Item found at = " + searchItemIndex);
    }

    private static int binarySearch(int[] input, int searchItem) {
        int min = 0;
        int max = input.length - 1;

        while(min <= max) {
            int midPoint = ((max + min) / 2) + ((max + min) % 2);
            if(searchItem <= input[midPoint]) {
                //read left side
                if(input[midPoint] == searchItem)
                    return midPoint;
                else {
                    max = midPoint;
                }
            } else {
                min = midPoint + 1;
            }
        }
        return -1;
    }

}
