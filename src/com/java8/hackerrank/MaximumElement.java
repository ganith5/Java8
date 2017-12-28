package com.java8.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Pavithra Sachidananda on 11/30/17.
 */
public class MaximumElement {

    private static Stack<DataNode> stack = new Stack();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tempMax = -1;

        while (n > 0) {
            int query = sc.nextInt();

            switch (query){
                case 1 : {
                    int data = sc.nextInt();
                    tempMax = data > tempMax ? data : tempMax;
                    stack.add(new DataNode(data, tempMax));
                }
                break;

                case 2: {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                    tempMax = stack.isEmpty() ? -1 : stack.peek().max;

                }
                break;
                case 3: {
                    if(!stack.isEmpty()) {
                        System.out.println(stack.peek().max);
                    }
                }
                break;
            }
            n--;
        }
        sc.close();
    }

    private static class DataNode {
        int val;
        int max;
        public DataNode(int val, int max) {
            this.val = val;
            this.max = max;
        }

    }
}
