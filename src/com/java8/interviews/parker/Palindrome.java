package com.java8.interviews.parker;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Pavithra Sachidananda on 1/7/18.
 */
public class Palindrome {

    public static void main(String[] args) {

        String palindrome = "civic";

        System.out.println("Is palindrome ? " + hasPalindromeCombination(palindrome));
    }

    private static boolean hasPalindromeCombination(String palindrome) {

        Set<Character> characterSet = new HashSet<>();

        for(char c : palindrome.toCharArray()) {
            if(characterSet.contains(c)){
                characterSet.remove(c);
            } else{
                characterSet.add(c);
            }
        }

        if(characterSet.size() < 2)
            return true;


        return false;

    }
}
