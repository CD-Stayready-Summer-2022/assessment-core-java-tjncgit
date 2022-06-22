package com.codedifferently.assessment01.part01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codedifferently.assessment01.part01.BasicStringUtils.reverse;
import static com.codedifferently.assessment01.part01.BasicStringUtils.reverseThenCamelCase;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        ArrayList<String> out = new ArrayList<>();
        int start = 0;
        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ') {
                out.add(sentence.substring(start, i));
                start = i + 1;
            } else if (i == sentence.length() - 1) {
                out.add(sentence.substring(start, i + 1));
            }
        }
        String[] arrOut = new String[out.size()];
        for(int i = 0; i < arrOut.length; i++) {
            arrOut[i] = out.get(i);
        }
        return arrOut;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence) {
        String out = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                out = sentence.substring(0, i);
                break;
            }
        }
        return out;
    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){
        return reverse(getFirstWord(sentence));
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){

        return reverseThenCamelCase(getFirstWord(sentence));
    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(i == index) {
                continue;
            } else {
                out.append(str.charAt(i));
            }
        }
        return out.toString();
    }
}
