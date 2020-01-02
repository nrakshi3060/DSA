package com.rak.dsa.strings;

import java.util.Arrays;

class AnagramChecker {
    boolean isAnagram(String inputString1, String inputString2){
        char[] inputCharArray1 = inputString1.toLowerCase().replaceAll(" ", "").toCharArray();
        char[] inputCharArray2 = inputString2.toLowerCase().replaceAll(" ", "").toCharArray();

        Arrays.sort(inputCharArray1);
        Arrays.sort(inputCharArray2);

        return Arrays.equals(inputCharArray1, inputCharArray2);
    }
}
