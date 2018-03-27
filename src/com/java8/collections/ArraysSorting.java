package com.java8.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Pavithra Sachidananda on 11/18/17.
 */
public class ArraysSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);

        Integer.parseInt("");


    }

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        Map<Integer, Long> candleHeightCountMap = Arrays.stream(ar).boxed().sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        OptionalLong max = candleHeightCountMap.values().stream().mapToLong(Long::intValue).max();

        return (int)max.getAsLong();

//        Long tallestCandleCount =
//                candleHeightCountMap.entrySet().stream()
//                        .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
//        return tallestCandleCount;

    }


}
