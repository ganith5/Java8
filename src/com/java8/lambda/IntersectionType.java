package com.java8.lambda;

import java.io.Serializable;

/**
 * Kind of implementing multiple interfaces.
 */
public class IntersectionType {

    public static void main(String[] args) {

        //Converts lambda expression to serializable type
        Serializable serializableCalculator = (Serializable & CalculatorType)(x, y) -> x * y;

        //Converts lambda expression to calculator type
        CalculatorType calculatorType = (NonFunction & CalculatorType)(x, y) -> x + y;
        System.out.println(calculatorType.calculate(6, 8));

    }



}

@FunctionalInterface
interface CalculatorType {

    int calculate(int x, int y);

}

interface NonFunction {

}

