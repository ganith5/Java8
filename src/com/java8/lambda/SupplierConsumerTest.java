package com.java8.lambda;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Supplier;

/**
 * Created by Pavithra Sachidananda on 11/3/17.
 */
public class SupplierConsumerTest {

    public static void main(String[] args) {
        consumes((trade
        ) -> {
            trade.setStatus("IN_TRANSIT");
        });

        Trade trade = supplies(Trade::new);
        System.out.println("Supplied trade = " + trade);

        DoubleUnaryOperator doubleUnaryOperator = (d) -> d + 100;
        System.out.println(doubleUnaryOperator.applyAsDouble(10));

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println(booleanSupplier.getAsBoolean());
    }


    public static void consumes(Consumer<Trade> tradeC){
        Trade trade = new Trade(40, "NEW");
        tradeC.accept(trade);

        System.out.println("Trade status changed : " + trade.getStatus());
    }

    public static Trade supplies(Supplier<Trade> supplier) {
       return supplier.get();
    }
}
