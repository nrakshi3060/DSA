package com.rak.dsa.sort;

public class Sort012 {

    void sort012(int[] nums){
        int start_index = 0;

        int nex_pos_0 = 0;
        int nex_pos_2 = nums.length-1;

        while(start_index <= nex_pos_2){
            if(nums[start_index] == 0){
                nums[start_index] = nums[nex_pos_0];
                nums[nex_pos_0] = 0;
                nex_pos_0 += 1;
                start_index += 1;
            } else if (nums[start_index] == 2){
                nums[start_index] = nums[nex_pos_2];
                nums[nex_pos_2] = 2;
                nex_pos_2 -= 1;
            } else {
                start_index += 1;
            }
        }
    }
}
