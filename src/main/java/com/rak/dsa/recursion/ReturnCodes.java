package com.rak.dsa.recursion;

import java.util.*;

public class ReturnCodes {
    /*
    * Problem statement
    In an encryption system where ASCII lower case letters represent numbers in the pattern a=1, b=2, c=3... and so on, find out all the codes that are possible for a given input number.

    Example 1

    number = 123
    codes_possible = ["aw", "abc", "lc"]
    Explanation: The codes are for the following number:

    1 . 23 = "aw"
    1 . 2 . 3 = "abc"
    12 . 3 = "lc"
    Example 2

    number = 145
    codes_possible = ["ade", "ne"]
    Return the codes in a list. The order of codes in the list is not important.

    Note: you can assume that the input number will not contain any 0s
    * */

    private char getAlphabet(int num){
        return (char) (num + 96);
    }

    List<String> returnAllCodes(int num){
        if(num == 0){
            return Arrays.asList("");
        }

        List<String> output10;
        List<String> output100 = new ArrayList<>();

        int remainder = num % 100;

        if (remainder <= 26 && num > 9){
            output100 = returnAllCodes(num/100);
            char currentChar100 = getAlphabet(remainder);
            for(int i = 0; i < output100.size(); i++){
                output100.set(i, output100.get(i) + currentChar100);
            }
        }

        remainder = num % 10;
        output10 = returnAllCodes(num / 10);
        char currentChar10 = getAlphabet(remainder);
        for(int i = 0; i < output10.size(); i++){
            output10.set(i, output10.get(i) + currentChar10);
        }

        List<String> output = new ArrayList<>();
        output.addAll(output10);
        output.addAll(output100);
        return output;
    }



}
