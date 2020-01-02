package com.rak.dsa.strings;

class StringReverser {
    String stringReverser(String input){
        StringBuilder reversedString = new StringBuilder();
        char[] inputCharArray = input.toCharArray();
        int n = input.length();
        for(int i=0; i<n; i++){
            reversedString.append(inputCharArray[(n-1)- i]);
        }
        return reversedString.toString();
    }
}
