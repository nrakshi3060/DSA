package com.rak.dsa.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalTriangleNthRow {

    private List<Integer> generate(List<Integer> arr){
        List<Integer> output = new ArrayList<>();
        output.add(1);
        int b = 0;

        for(int i=0; i < arr.size()-1; i++){
            if(arr.size() > 1){
                b = arr.get(i+1);
            }
            output.add(arr.get(i) + b);
        }

        output.add(1);
        return output;
    }

    List<Integer> nthRow(int n){
        if(n==0){
            return Collections.singletonList(1);
        } else {
            return generate(nthRow(n-1));
        }
    }
}
