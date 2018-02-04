package com.java8.interviews.parker;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * TIME Complexity = O(n) - we have to look at every character in the input string. That is the minimum required
 * Space complexity = O(n) - because every word is stored in the hashmap. Worse case every word can be different
 */
public class WordCloud {

    public static void main(String[] args) {

        //String input = "Friends, Romans, countrymen! Let us eat cake.";
        //String input = "We came, we saw, we ate cake.";
        String input = "New tourists in New York often wait in long lines for cronuts.";

        WordCloud wordCloud = new WordCloud(input);
        System.out.print("Word Cloud ------ " + wordCloud.getWordCountsMap() + " ------");
    }

    private Map<String, Integer> wordCountMap = new HashMap<>();

    public WordCloud(String input) {
        populateWords(input);
    }

    private void populateWords(String input) {
        int charLength = input.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < charLength; i++) {
            char c = input.charAt(i);

            if(Character.isWhitespace(c) || Character.isSpaceChar(c)){
                addWordsToWordMap(builder.toString());
                //System.out.println(builder.toString());
                builder.setLength(0);
            } else if(c == '.') {
                //means end of sentence
                if(i == charLength - 1)
                    addWordsToWordMap(builder.toString());
            }
            else if(c == '-'){
                if((i>0)
                        && Character.isAlphabetic(input.charAt(i-1))
                        && Character.isAlphabetic(input.charAt(i+1))) {
                    builder.append(c);
                }
            }
            else if(Character.isAlphabetic(c) || Character.isDigit(c))
                builder.append(c);
        }
    }

    public Map<String, Integer> getWordCountsMap() {
        return Collections.unmodifiableMap(wordCountMap);
    }


    private  void addWordsToWordMap(String word) {

        if(wordCountMap.containsKey(word.trim())){
            wordCountMap.put(word, wordCountMap.get(word) + 1);

        } else if(wordCountMap.containsKey(capitalize(word.trim()))){
            //IF A UPPERCASE VERSION OF WORD EXISTS IN THE MAP, WE KNOW 'WORD' IS LOWERCASE, HENCE, GET THE UPPERCASE VERSION
            //FROM MAP, INCREMENT AND ADD THE LOWERCASE VERSION.
            wordCountMap.put(word, wordCountMap.get(capitalize(word.trim())) + 1);
            wordCountMap.remove(capitalize(word));

        } else if(!wordCountMap.containsKey(word)){
            wordCountMap.put(word, 1);
        }
    }

    //METHOD USED TO CAPITALIZE THE FIRST LETTER.
    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
