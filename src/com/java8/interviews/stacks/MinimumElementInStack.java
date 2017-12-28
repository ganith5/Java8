package com.java8.interviews.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Pavithra Sachidananda on 11/24/17.
 * The program as constant time complexity as the minimum is calculated as and when the input is accepted.
 */
public class MinimumElementInStack {

    public static void main(String[] args) {
        StackOperations stackOperations = new StackOperations<>();
        stackOperations.push(100);
        stackOperations.push(2);
        stackOperations.push(3);
        stackOperations.push(-1);
        stackOperations.push(18);


        System.out.println("Minimum = " + stackOperations.getMinimum());

    }

    static class StackOperations<Integer> {
        Stack<java.lang.Integer> stack = new Stack<>();
        int minimum;


        public void push(int n) {

            if(stack.isEmpty()) {
                minimum = n;

            } else if(minimum > n){
                minimum = n;

            }
            stack.push(n);

        }

        public int getMinimum() {
            return minimum;
        }

    }
}
