package com.java8.lambda;

/**
 * 1) Optional type declaration − No need to declare the type of a parameter.
 * The compiler can inference the same from the value of the parameter.

 2) Optional parenthesis around parameter − No need to declare a single parameter in parenthesis.
 For multiple parameters, parentheses are required.

 3) Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

 4) Optional return keyword − The compiler automatically returns the value if the body has a single expression
 to return the value. Curly braces are required to indicate that expression returns a value.
 */


public class JavaMathTester {

    public static void main(String[] args) {

        JavaMathTester javaMathTester = new JavaMathTester();
        GreetingService greetingService = message -> System.out.println(message);
        javaMathTester.printStr("Addition : " + javaMathTester.operate(3, 4, addition), greetingService);
        javaMathTester.printStr("Multiplication : " + javaMathTester.operate(3, 4, multiply), greetingService);

        javaMathTester.printStr("Subtraction : " + javaMathTester.operate(3, 4, subtraction), greetingService);

        javaMathTester.printStr("Hello World!", greetingService);
    }

    static MathOperation multiply = (a, b) -> a * b;
    static MathOperation addition = (a, b) -> a + b;
    static MathOperation subtraction = (a, b) -> a - b;


    private int operate(int a, int b, MathOperation mathOperation){
       return  mathOperation.operation(a, b);
    }

    private void printStr(String message, GreetingService greetingService) {
        greetingService.message(message);
    }


}

interface GreetingService {
    void message(Object m);
}

interface MathOperation {
    int operation(int a, int b);
}
