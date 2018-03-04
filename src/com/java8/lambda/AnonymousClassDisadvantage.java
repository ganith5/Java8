package com.java8.lambda;

/**
 * Created by Pavithra Sachidananda on 11/4/17.
 */
public class AnonymousClassDisadvantage {

    public static void main(String[] args) {
        IAddable<Trade> iAddable = new IAddable<Trade>() {
            @Override
            public Trade add(Trade a1, Trade a2) {
                return new Trade(a1.getQuantity() + a2.getQuantity(), "NEW");
            }
        };

        IAddable<Trade> secondAddable = new IAddable<Trade>() {
            @Override
            public Trade add(Trade a1, Trade a2) {
                return new Trade(a1.getQuantity() / a2.getQuantity(), "NEW");
            }
        };

        Trade trade1 = new Trade(10, "NEW");
        Trade trade2 = new Trade(10, "NEW");
        iAddable.add(trade1, trade2);

        secondAddable.add(trade1, trade2);

        /**
         * Everytime a new behavior is requested a new class implementation of IAddable is to be created
         * Or use if-else to provide different implementation
         */


    }
}
