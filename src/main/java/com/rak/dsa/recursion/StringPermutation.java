package com.rak.dsa.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringPermutation {
    List<String> permute(String input){
        return returnPermutation(input, 0);
    }

    private List<String> returnPermutation(String input, int index){
        if(index >= input.length()){
            return Collections.singletonList("");
        } else {
            List<String> output = new ArrayList<>();
            List<String> smallOutput = returnPermutation(input, index + 1);
            char currentChar = input.charAt(index);

            for(String p : smallOutput){
                for(int i=0; i < p.length()+1; i++){
                    String new_p = p.substring(0, i) + currentChar + p.substring(i);
                    output.add(new_p);
                }
            }
            return output;
        }
    }
}
