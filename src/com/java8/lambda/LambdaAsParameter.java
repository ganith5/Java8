package com.java8.lambda;

/**
 * Behavior parameterization - passing different behaviors as lambda. Here, first addition, multiply,.. is passed
 */
public class LambdaAsParameter {

    public static void main(String[] args) {

        engine(add());
        engine(multiply());
        engine((x, y) -> x / y); // lambda expressions can be passed as method parameter
        engine((Calculator) (x, y) -> x - y); //Lambda expressions can be preceded by cast

    }

    private static Calculator multiply() {
        return (a, b) -> a * b; // lamda expressions can be returned
    }

    private static Calculator add() {
        Calculator iCal = (x,y) -> x + y; // lambda can exist right of assignment operator
        return  iCal;
    }

    public static void engine(Calculator calculator) {
        int x = 4, y = 2;
        System.out.println(calculator.calculate(x, y));
    }
}

@FunctionalInterface // only one abstract method can be declared inside a functional interface
interface Calculator {
    int calculate(int x, int y);

}
