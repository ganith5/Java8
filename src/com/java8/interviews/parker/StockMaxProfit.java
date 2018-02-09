package com.java8.interviews.parker;

/**
 * This way of holding a initial value as min/max and comparing the rest of the elements
 * to this min/max value is called greedy algorithm.
 *
 * Here - O(n) time complexity and O(1) space complexity
 */
public class StockMaxProfit {

    public int getMaxProfit(int[] stockPricesYesterday){

        int min = stockPricesYesterday[0], maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];

        for (int i = 1; i < stockPricesYesterday.length; i++) {
            int currentPrice = stockPricesYesterday[i];

            int currentProfit = currentPrice - min;
            min = Math.min(min, currentPrice);
            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
        if(stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException("The stock array must have at least one buy and one sell rate");
        }
        StockMaxProfit appleStock = new StockMaxProfit();
        System.out.println("Max profit = " + appleStock.getMaxProfit(stockPricesYesterday));

    }
}
