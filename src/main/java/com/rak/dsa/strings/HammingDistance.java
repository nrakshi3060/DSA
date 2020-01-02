package com.rak.dsa.strings;

class HammingDistance {
    int findHammingDistance(String str1, String str2){
        if (str1.length() != str2.length()){
            return 0;
        }
        char[] input1 = str1.toCharArray();
        char[] input2 = str2.toCharArray();

        int count = 0;

        for(int i=0; i < str1.length(); i++){
            if(input1[i] != input2[i]){
                count += 1;
            }
        }
        return count;
    }
}
