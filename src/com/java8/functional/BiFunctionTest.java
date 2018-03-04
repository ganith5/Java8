package com.java8.functional;

import com.java8.lambda.Trade;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

/**
 * Created by Pavithra Sachidananda on 11/3/17.
 */
public class BiFunctionTest {

    public static void main(String[] args) {
        BiFunction<Trade, Trade, Integer> biFunction = (trade, trade2) -> trade.getQuantity() + trade2.getQuantity();

        biFunction.apply(new Trade(30, "T1"), new Trade(40, "T2"));

        BiPredicate<Trade, Trade> biPredicate = (trade1, trade2) -> trade1.getStatus().equals(trade2.getStatus());
        biPredicate.test(new Trade(30, "T1"), new Trade(40, "T2"));

        BinaryOperator<Trade> binaryOperator = ((trade, trade2) -> new Trade(trade.getQuantity(), trade2.getStatus()));
        System.out.println("Trade : " +
                binaryOperator.apply(new Trade(30, "T1"), new Trade(40, "T2")));
    }
}
