package com.rak.dsa.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSort {
    List<Integer> sortArray(int[] nums) {
        return sortArrayHelper(nums, 0, nums.length - 1);
    }

    private List<Integer> sortArrayHelper(int[] nums, int start_index, int end_index) {
        if(start_index == end_index){
            return Arrays.asList(nums[start_index]);
        } else if( start_index > end_index){
            return new ArrayList<>();
        } else {
            int mid_index = (start_index + end_index)/2;

            List<Integer> left = sortArrayHelper(nums, start_index, mid_index);
            List<Integer> right = sortArrayHelper(nums, mid_index + 1, end_index);

            return merged(left, right);
        }
    }

    private List<Integer> merged(List<Integer> left, List<Integer> right){
        List<Integer> merged = new ArrayList<>();
        int left_index = 0;
        int right_index = 0;

        while(left_index < left.size() && right_index < right.size()){
            if(left.get(left_index) > right.get(right_index)){
                merged.add(right.get(right_index));
                right_index += 1;
            } else {
                merged.add(left.get(left_index));
                left_index += 1;
            }
        }

        for(int i=left_index; i <left.size(); i++ ){
            merged.add(left.get(i));
        }

        for(int i=right_index; i < right.size(); i++){
            merged.add(right.get(i));
        }

        return merged;
    }
}
