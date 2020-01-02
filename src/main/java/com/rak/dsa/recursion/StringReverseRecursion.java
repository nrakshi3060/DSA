package com.rak.dsa.recursion;

class StringReverseRecursion {
    String reverse(String input){
        String output = "";
        if(input == null || input.length() <= 0) {
            return "";
        } else {
            char firstChar = input.charAt(0);
            String reversed_substr = reverse(input.substring(1, input.length()));
            output = reversed_substr + firstChar;
            return output;
        }
    }
}
