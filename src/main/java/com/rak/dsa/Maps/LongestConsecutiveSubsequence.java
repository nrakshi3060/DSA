package com.rak.dsa.Maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    List<Integer> findLongestConsecutiveSubsequence(int[] arr){
        Set<Integer> set = new HashSet<>();
        List<Integer> consecutiveSubsequence = new ArrayList<>();
        int maxCount = 0;
        for(int i=0; i < arr.length; i++){
            set.add(arr[i]);
        }

        for(int i=0; i< set.size(); i++){
            if(!set.contains(arr[i]-1)){
                List<Integer> currConsecutiveSubsequence = new ArrayList<>();
                int num = arr[i];
                int count = 0;
                while(set.contains(num)){
                    currConsecutiveSubsequence.add(num);
                    num += 1;
                    count += 1;
                }

                if(maxCount < count){
                    maxCount = count;
                    consecutiveSubsequence = currConsecutiveSubsequence;
                }
            }
        }
        return consecutiveSubsequence;
    }
}
