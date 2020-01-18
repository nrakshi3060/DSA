package com.rak.dsa.sort;

import java.util.ArrayList;
import java.util.List;

public class CountingInversions {
    public int countInversion(int[] nums){
        return countInversionHelper(nums, 0, nums.length-1);
    }

    private int countInversionHelper(int[] nums, int start_index, int end_index){
        if(start_index >= end_index){
            return 0;
        }
        int mid_index = (start_index + end_index)/2;

        int left_count = countInversionHelper(nums, start_index, mid_index);
        int right_count = countInversionHelper(nums, mid_index + 1, end_index);

        int count = left_count + right_count;

        count += merge(nums, start_index, mid_index, mid_index + 1, end_index);
        return count;
    }

    private int merge(int[] nums, int left_start_index, int left_end_index, int right_start_index, int right_end_index){
        List<Integer> output = new ArrayList<>();
        int count = 0;
        int left_index = left_start_index;
        int right_index = right_start_index;

        while(left_index <= left_end_index && right_index <= right_end_index){
            if(nums[left_index] <= nums[right_index]){
                output.add(nums[left_index]);
                left_index += 1;
            } else {
                count += left_end_index - left_index + 1;
                output.add(nums[right_index]);
                right_index += 1;
            }
        }

        for(int i=left_index; i <=left_end_index; i++){
            output.add(nums[i]);
        }

        for(int i=right_index; i <=right_end_index; i++){
            output.add(nums[i]);
        }
        int index = left_start_index;
        for(Integer element : output){
            nums[index] = element;
            index += 1;
        }

        return count;
    }
}
