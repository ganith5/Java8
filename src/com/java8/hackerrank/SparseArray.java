package com.java8.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pavithra Sachidananda on 12/8/17.
 */
public class SparseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfInputs = scanner.nextInt();
        List<String> inputList = new ArrayList<>();

        while(noOfInputs > 0) {

            String inputStr = scanner.next();
            inputList.add(inputStr);

            noOfInputs--;
        }

        int queryCount = scanner.nextInt();
        while (queryCount > 0) {
            String query = scanner.next();
            long count = inputList.stream().filter(query::equals).count();
            System.out.println(count);
            queryCount--;
        }


    }
}
