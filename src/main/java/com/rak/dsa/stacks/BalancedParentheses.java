package com.rak.dsa.stacks;

import java.util.Stack;

public class BalancedParentheses {
    private boolean isMatchingPair(char c1, char c2){
        return (c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']');
    }

    boolean isBalancedParentheses(String s){
        Stack<Character> characterStack = new Stack<Character>();
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' ||  s.charAt(i) == '['){
                characterStack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' ||  s.charAt(i) == ']'){
                if (characterStack.isEmpty()) {
                    return false;
                } else if(! isMatchingPair(characterStack.pop(), s.charAt(i))){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
