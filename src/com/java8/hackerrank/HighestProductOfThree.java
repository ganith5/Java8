package com.java8.hackerrank;

/**
 * Created by Pavithra Sachidananda on 12/2/17.
 */
public class HighestProductOfThree {



    public static void main(String[] args) {
        int[] intArray = {2, 7, 3, 4, 5};
        int product = arrayOfInts(intArray);
        System.out.println("Product = " + product);
    }

    private static int arrayOfInts(int[] intArray) {
        int length = intArray.length - 1;
        for (int i=0; i<length; i++) {
            if(intArray[i] > intArray[i+1]){
                int temp = intArray[i];
                intArray[i] = intArray[i+1];
                intArray[i+1] = temp;
            }
        }

        return intArray[length] * intArray[length -1] * intArray[length - 2];
    }
}
