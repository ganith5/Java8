package com.java8.hackerrank;

import java.util.Arrays;
import java.util.Map;
import java.util.OptionalLong;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Pavithra Sachidananda on 11/23/17.
 */
public class BirthdayCake {
    static int birthdayCakeCandles(int n, int[] ar) {

       //assign the zeroth value as tallest initially
        int tallest = ar[0];
        int arrLength, count;
        arrLength = count = ar.length;
        for (int i = 1; i < arrLength; i++) {
            if(tallest > ar[i]){
                count = count - 1;
            } else if(tallest < ar[i]) {
                count = count - 1;
                tallest = ar[i];
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
