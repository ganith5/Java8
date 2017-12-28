package com.java8.hackerrank;

import java.util.*;

/**
 * Created by Pavithra Sachidananda on 12/9/17.
 */
public class SparseArrayUsingMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfInputs = scanner.nextInt();
        Map<String, Integer> inputCountMap = new HashMap<>();

        while(noOfInputs > 0) {

            String inputStr = scanner.next();
            if(inputCountMap.containsKey(inputStr)) {
                inputCountMap.put(inputStr, inputCountMap.get(inputStr).intValue() + 1);
            } else {
                inputCountMap.put(inputStr, 1);
            }

            noOfInputs--;
        }

        int queryCount = scanner.nextInt();
        while (queryCount > 0) {
            String query = scanner.next();
            System.out.println(inputCountMap.get(query));
            queryCount--;
        }

    }
}
