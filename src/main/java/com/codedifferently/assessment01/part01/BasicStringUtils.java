package com.codedifferently.assessment01.part01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i == 0) {
                newStr.append(str.substring(i, i + 1).toUpperCase().charAt(0));
            } else if (str.charAt(i) == ' ') {
                newStr.append(str.substring(i + 1, i + 2).toUpperCase().charAt(0));
                i+=1;
            } else {
                newStr.append(str.charAt(i));
            }
        }
        Pattern p = Pattern.compile("\\s");
        Matcher m = p.matcher(newStr);
        return m.replaceAll("");
    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        StringBuilder out = new StringBuilder();
        out.append(str);
        return out.reverse().toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        String reverse = reverse(str);
        return camelCase(reverse);
    }

    public static String removeFirstAndLastCharacter(String str){

        return str.substring(1,str.length() - 1);
    }
}
