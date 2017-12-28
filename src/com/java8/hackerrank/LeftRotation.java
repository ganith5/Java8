package com.java8.hackerrank;

import java.util.Scanner;

/**
 * Created by Pavithra Sachidananda on 12/3/17.
 * Modulo functions are used in finding reminders
 * Wrapping indexes back to starting values
 * Finding hours min, seconds from seconds
 *
 * Time complexity O(d)
 * Space complexity O(1)
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

        result = rightRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

    private static int[] leftRotation(int[] a, int d) {
        int n = a.length;
        int[] temp = new int[n];
        for (int i = 0; i < a.length; i++) {
            temp[(n-d+i) % n] = a[i];
        }
        return temp;
    }

    private static int[] rightRotation(int[] a, int d) {
        int n = a.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(n+d+i) % n] = a[i];
        }
        return temp;
    }
}
