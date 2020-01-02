package com.rak.dsa.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPermutation {
    public List<List<Integer>> permute(int[] nums) {
        return returnPermutations(nums, 0);
    }

    private List<List<Integer>> returnPermutations(int[] nums, int index){
        List<List<Integer>> output = new ArrayList<>();

        if(index >= nums.length){
            List<Integer> integers = new ArrayList<>();
            return Collections.singletonList(integers);
        } else {
            List<List<Integer>> smallOuput = returnPermutations(nums, index + 1);
            Integer currentChar = nums[index];

            for(List<Integer> p : smallOuput){
                for(int i=0; i< p.size()+1; i++){
                    List<Integer> r = new ArrayList<>(p);
                    r.add(i, currentChar);
                    output.add(r);
                }
            }
            return output;
        }
    }

}
