package com.rak.dsa.stacks;

public class MinimumBracketReversal {
    int countMinimumBracketReversal(String s){

        if (s.length() %2 != 0){
            return -1;
        }

        int close = 0;
        int open = 0;

        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == '{'){
                open += 1;
            } else {
                if(open == 0){
                    close += 1;
                } else {
                    open -= 1;
                }
            }
        }
        int l =(int) (Math.ceil(open/2) + Math.ceil(close/2));
        return l;
    }
}
