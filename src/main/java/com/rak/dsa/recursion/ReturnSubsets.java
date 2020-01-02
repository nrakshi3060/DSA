package com.rak.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnSubsets {
    List<List<Integer>> returnSubsets(int[] nums){
        return returnSubsetsUtils(nums, 0);
    }

    private List<List<Integer>> returnSubsetsUtils(int[] nums, int index){
        if(index >= nums.length){
            return Arrays.asList(Arrays.asList());
        }
        List<List<Integer>> small_output = returnSubsetsUtils(nums, index + 1);

        List<List<Integer>> output = new ArrayList<>(small_output);

        for(List<Integer> item : small_output){
            List<Integer> current_output = new ArrayList<>();
            current_output.add(nums[index]);
            current_output.addAll(item);
            output.add(current_output);
        }
        return output;
    }
}
