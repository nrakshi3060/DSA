package com.rak.dsa.sort;

public class QuickSort {

    private int findPivotIndex(int[] items, int start_index, int end_index){
        int pivot_index = end_index;
        int left_index = start_index;

        while(pivot_index != left_index){
            int item = items[left_index];
            int pivot_value = items[pivot_index];

            if(item <= pivot_value){
                left_index += 1;
                continue;
            }

            items[left_index] = items[pivot_index-1];
            items[pivot_index - 1] = pivot_value;
            items[pivot_index] = item;
            pivot_index -= 1;

        }

        return pivot_index;
    }

    private void sort(int[] nums, int start_index, int end_index){
        if(start_index >= end_index){
            return;
        }

        int pivot_index = findPivotIndex(nums, start_index, end_index);
        sort(nums, start_index, pivot_index-1);
        sort(nums, pivot_index+1, end_index);
    }

    void sortArray(int[] nums){
        sort(nums, 0, nums.length-1);
    }

}
