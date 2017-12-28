package com.java8.interviews;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * Created by Pavithra Sachidananda on 11/20/17.
 */
public class OddNumberOfTimes {

    public static void main(String[] args) {
        int[] numbers = {2,3, 4, 3, 1, 4, 5, 1, 4, 2, 5};
        //List<Integer> numbers = Arrays.asList(2, 3, 4, 3, 1, 4, 5, 1, 4, 2, 5);
        Map<Integer, Integer> numberMap = new HashMap<>();

        printNumberOccuringOddNumberOfTimes(numbers);


//        for (int i:numbers
//             ) {
//            int count = 0;
//            //System.out.println(i);
//            if(!numberMap.containsKey(i)){
//                numberMap.put(i, ++count);
//            }else{
//
//                count = numberMap.get(i);
//                numberMap.put(i, ++count);
//            }
//           // numberMap.computeIfAbsent()
//
//
//        }
//        System.out.println("key = count : " + numberMap);
//
//        Set<Map.Entry<Integer, Integer>> entrySet = numberMap.entrySet();
//        for (Map.Entry<Integer, Integer> entry:entrySet
//             ) {
//            if((entry.getValue() % 2 != 0)){
//                System.out.println("Ans : " + entry.getKey());
//            }
//        }




    }

    public static void printNumberOccuringOddNumberOfTimes(int[] input) {
        if(input == null || input.length == 0) {
            System.out.println("Empty input array.");
            return;
        }
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = result | input[i];
            System.out.println("Result " + result);
        }
        System.out.println("Number occurring odd number of times is " + result);
    }
}
