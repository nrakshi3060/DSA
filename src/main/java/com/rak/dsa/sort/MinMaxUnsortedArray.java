package com.rak.dsa.sort;

public class MinMaxUnsortedArray {
    int[] getMinMax(int[] nums){
        //
        return getMinMaxFunc(nums, 0, nums.length-1);
    }

    int[] getMinMaxFunc(int[] nums, int start_index, int end_index){
        if(start_index > end_index){
            return new int[2];
        }

        if(start_index == end_index){
            return new int[] {nums[start_index], nums[end_index]};
        }

        if(start_index == (end_index - 1)){
            int[] output = new int[2];
            if(nums[start_index] > nums[end_index]){
                output[0] = nums[end_index];
                output[1] = nums[start_index];
            } else {
                output[0] = nums[start_index];
                output[1] = nums[end_index];
            }
            return output;
        }

        int mid_index = (start_index + end_index)/2;

        int[] outputLeft = getMinMaxFunc(nums, start_index, mid_index);
        int[] outputRight = getMinMaxFunc(nums, mid_index+1, end_index);
        int[] output = new int[2];

        if(outputLeft[0] < outputRight[0]){
            output[0] = outputLeft[0];
        } else {
            output[0] = outputRight[0];
        }

        if(outputLeft[1] > outputRight[1]){
            output[1] = outputLeft[1];
        } else {
            output[1] = outputRight[1];
        }
        return output;
    }
}
