package com.java8.interviews.stacks;

import java.util.*;

/**
 * Created by Pavithra Sachidananda on 11/24/17.
 * The program as a complexity of O(n) because we iterate through the entire 'expression' string
 * The map functions are constant time operations as they are not dependent on the input size.
 */
public class BracketsMatcher {

    static Map<Character, Character> bracketMapper;
    static Set<Character> validOpeningBraces;

    static {
        bracketMapper = new HashMap<>();
        bracketMapper.put('}', '{');
        bracketMapper.put(']', '[');
        bracketMapper.put(')','(');

        validOpeningBraces = new HashSet<>(bracketMapper.values());
    }

    public static boolean hasMatchingBracket(String expression) {
        Stack<Character> openingBracesStack = new Stack<>();
        int exprLength = expression.length();
        for (int i = 0; i < exprLength; i++) {
            char c = expression.charAt(i);
            if(validOpeningBraces.contains(c)){
                openingBracesStack.push(c);
            }

            if(bracketMapper.containsKey(c)){
                char lastBrace = openingBracesStack.pop();
                if(lastBrace != bracketMapper.get(c)){
                    return false;
                }
            }
        }

        if(openingBracesStack.isEmpty())
            return true;

        return false;
    }
    public static void main(String[] args) {

        System.out.println("  result :  " + hasMatchingBracket("(ABC)[{DEF}]"));
        System.out.println("  result :  " + hasMatchingBracket("(ABC)[{DEF})]"));

    }
}
