package com.java8.lambda;

/**
 * Created by Pavithra Sachidananda on 11/3/17.
 */
public class Trade {

    Trade(){}

    public Trade(int quantity, String status){
        this.quantity = quantity;
        this.status = status;
    }

    private int quantity;

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return quantity + " " + status;
    }
}
