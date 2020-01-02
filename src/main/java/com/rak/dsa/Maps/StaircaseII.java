package com.rak.dsa.Maps;

import java.util.HashMap;
import java.util.Map;

public class StaircaseII {
    public int numberOfWaysToClimbStairs(int numberOfSteps){
        Map<Integer, Integer> map = new HashMap<>();
        return waysToClimbStairs(numberOfSteps, map);
    }

    private int waysToClimbStairs(int numberOfSteps, Map<Integer, Integer> map){
        int output;
        if(numberOfSteps == 1){
            output = 1;
        } else if(numberOfSteps == 2) {
            output = 2;
        } else if(numberOfSteps == 3){
            output = 4;
        } else {
            int firstOutput, secondOutput, thirdOutput;
            if(map.containsKey(numberOfSteps-1)){
                firstOutput = map.get(numberOfSteps);
            } else {
                firstOutput = waysToClimbStairs(numberOfSteps-1, map);
            }

            if(map.containsKey(numberOfSteps-2)){
                secondOutput = map.get(numberOfSteps-2);
            } else {
                secondOutput = waysToClimbStairs(numberOfSteps-2, map);
            }

            if(map.containsKey(numberOfSteps-3)){
                thirdOutput = map.get(numberOfSteps-3);
            } else {
                thirdOutput = waysToClimbStairs(numberOfSteps-3, map);
            }
            output = firstOutput + secondOutput + thirdOutput;
        }
        map.put(numberOfSteps, output);
        return output;
    }
}
