package com.rak.dsa.strings;

import java.util.ArrayList;
import java.util.List;

class WordFlipper {
    String wordFlipper(String input){
        String[] words = input.split(" ");
        List<String> output = new ArrayList<>();
        StringReverser stringReverser = new StringReverser();

        for(String word: words){
             output.add(stringReverser.stringReverser(word));
        }
        return String.join(" ", output);
    }
}
