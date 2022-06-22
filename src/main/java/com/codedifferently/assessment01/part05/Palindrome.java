package com.codedifferently.assessment01.part05;

import java.awt.*;

public class Palindrome {
    public Integer countPalindromes(String input){
        int subCount = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                StringBuilder str = new StringBuilder(input.substring(i, j));
                if(str.toString().equals(str.reverse().toString()) ) {
                    subCount += 1;
                }
            }
        }
        return subCount;
    }
}
