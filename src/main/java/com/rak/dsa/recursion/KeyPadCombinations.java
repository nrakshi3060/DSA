package com.rak.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KeyPadCombinations {
    private List<String> getCharacters(int num) {
        if (num == 2) {
            return Arrays.asList( "a", "b", "c");
        } else if (num == 3) {
            return Arrays.asList( "d", "e", "f");
        } else if (num == 4) {
            return Arrays.asList( "g", "h", "i");
        } else if (num == 5) {
            return Arrays.asList( "j", "k", "l");
        } else if (num == 6) {
            return Arrays.asList( "m", "n", "o");
        } else if (num == 7) {
            return Arrays.asList( "p", "q", "r", "s");
        } else if (num == 8) {
            return Arrays.asList( "t", "u", "v");
        } else if (num == 9) {
            return Arrays.asList( "p", "q", "r", "s");
        } else {
            return Collections.singletonList("");
        }
    }

    List<String> keyPad(int num){
        if (num <= 1){
            return Collections.singletonList("");
        } else if ( num <= 9){
            return getCharacters(num);
        } else {
            List<String> output = new ArrayList<>();
            int last_digit = num % 10;
            List<String> smallOutput = keyPad(num/10);
            List<String> keyPad_strings = getCharacters(last_digit);
            for(String c: keyPad_strings){
                for(String s: smallOutput){
                    String new_p = s + c;
                    output.add(new_p);
                }
            }
            return output;
        }
    }
}
