package com.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Pavithra Sachidananda on 11/3/17.
 */
public class IAddableTest {

    public static void main(String[] args) {
        IAddable<Integer> addIntegers = (a, b) -> (a + b);
        addIntegers.add(3, 4);

        IAddable<Trade> addTradeQuantities = (t1, t2) -> {
            t1.setQuantity(t1.getQuantity() + t2.getQuantity());
            return t1;
        };
        addTradeQuantities.add(new Trade(), new Trade());
        encryptTrade(addTradeQuantities, new Trade(), new Trade());

//        new Thread(() -> sendEmail()).start();
//
//        Runnable r = () -> sendEmail();
//        new Thread(r).start();

        List<Trade> tradeList = Arrays.asList(new Trade(10, "NEW"), new Trade(20, "CLOSED"),
                new Trade(30, "RUNNING"));

        ITradeCheck tradeCheck = (Trade t) -> t.getStatus().equals("NEW");
        System.out.println(filterTrade(tradeCheck, tradeList));


    }

    public static List<Trade> filterTrade(ITradeCheck tradeCheck, List<Trade> tradeList) {

        List<Trade> result = new ArrayList<>();

        for(Trade trade: tradeList) {
            if(!tradeCheck.check(trade)){
                result.add(trade);
            }
        }

        return result;

    }


    public static void encryptTrade(IAddable<Trade> adder, Trade t1, Trade t2) {
        adder.add(t1, t2);
    }

    public static void sendEmail(){
        System.out.println();
    }



}
