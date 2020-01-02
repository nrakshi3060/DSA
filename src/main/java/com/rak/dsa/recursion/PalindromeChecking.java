package com.rak.dsa.recursion;

public class PalindromeChecking {
    boolean isPalindrome(String input){
        if(input.length() <= 1){
            return true;
        } else {
            char first_char = input.charAt(0);
            char last_char = input.charAt(input.length()-1);

            return (first_char == last_char) && isPalindrome(input.substring(1, input.length()-1));
        }
    }
}
