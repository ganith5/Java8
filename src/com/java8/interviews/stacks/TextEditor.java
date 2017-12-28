package com.java8.interviews.stacks;

import java.util.Scanner;
import java.util.Stack;


/**
 * Created by Pavithra Sachidananda on 12/5/17.
 */
public class TextEditor {

    static Stack<String> textStack = new Stack<>();
  //  static Stack<Operation> operationStack = new Stack<>();
    static final int OPR_APPEND = 1;
    static final int OPR_DELETE = 2;
    static final int OPR_PRINT = 3;
    static final int OPR_UNDO = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfOperations = scanner.nextInt();

        String currentText = "";

        while(noOfOperations > 0) {
            int type = scanner.nextInt();
            switch (type) {
                case OPR_APPEND: {
                    currentText = currentText + scanner.next();
                    append(currentText);
                    break;
                }
                case OPR_DELETE: {
                    currentText = delete(currentText, scanner.nextInt());
                    //currentText = textStack.peek();
                    break;
                }
                case OPR_PRINT: {
                    print(currentText, scanner.nextInt());
                    break;
                }
                case OPR_UNDO: {
                    undo();
                    currentText = textStack.peek();
                    break;
                }

            }
            noOfOperations--;
        }
        scanner.close();

    }

    private static String delete(String currentText, int deleteIndex) {
       // String text = textStack.peek();
        currentText = currentText.substring(0,(currentText.length()-deleteIndex));
        textStack.push(currentText);
        return currentText;


    }

    private static void print(String currentText, int printIndex) {
        System.out.println(currentText.charAt(printIndex-1));
    }

    private static void append(String input) {
        textStack.push(input);
    }

    private static void undo() {
        textStack.pop();
    }

}
