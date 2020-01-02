package com.rak.dsa.arrays;

class MaxSumSubarray {
    int getMaxSumSubarray(int[] nums){
        int max_sum = nums[0];
        int current_sum = nums[0];

        for(int i=1; i<nums.length; i++){
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }

    int getMaxSumSubarrayDP(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum = sum + num;

            if (max < sum) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}
