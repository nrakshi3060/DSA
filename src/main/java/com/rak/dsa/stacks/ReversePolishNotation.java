package com.rak.dsa.stacks;

import java.util.Stack;

public class ReversePolishNotation {
    int evaluatePostFix(String[] tokens){
        Stack<Integer> nums = new Stack<>();
        int first;
        int second;
        int output;
        for(String s : tokens){
            if (s.equals("*")){
                second = nums.pop();
                first = nums.pop();
                output = first + second;
                nums.push(output);
            } else if(s.equals("/")){
                second = nums.pop();
                first = nums.pop();
                output = first/second;
                nums.push(output);
            } else if(s.equals("+")){
                second = nums.pop();
                first = nums.pop();
                output = first + second;
                nums.push(output);
            } else if(s.equals("-")){
                second = nums.pop();
                first = nums.pop();
                output = first - second;
                nums.push(output);
            } else {
                nums.push(Integer.parseInt(s));
            }
        }
        return nums.pop();
    }
}
