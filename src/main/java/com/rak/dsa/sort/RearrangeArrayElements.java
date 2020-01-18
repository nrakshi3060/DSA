package com.rak.dsa.sort;

import java.util.Arrays;

public class RearrangeArrayElements {
    int[] rearrangeArrayElementsToFormTwoNumbersWhoseSumIsMaximum(int[] nums){
      Arrays.sort(nums);
      int x = 0;
      int y = 0;

      for(int i = nums.length-1; i >= 0;  i--){
          if(i % 2 == 0){
              x = x * 10 + nums[i];
          } else {
              y = y * 10 + nums[i];
          }
      }
      int[] output = new int[2];
      output[0] = x;
      output[1] = y;
      return output;
    }
}
