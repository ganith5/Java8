package com.java8.lambda;

/**
 *
 * Less verbose anonymous function implementation
 * Created by Pavithra Sachidananda on 11/4/17.
 */
public class LambdaAdvantage {

    public static void main(String[] args) {
        Trade trade1 = new Trade(10, "NEW");
        Trade trade2 = new Trade(10, "NEW");

        IAddable<Trade> iAddable = (t1, t2) -> new Trade(t1.getQuantity() + t2.getQuantity(), "NEW");
        System.out.println(iAddable.add(trade1, trade2));
        iAddable = (t1, t2) -> new Trade(t1.getQuantity() / t2.getQuantity(), "NEW");



        System.out.println(iAddable.add(trade1,trade2));
    }
}
