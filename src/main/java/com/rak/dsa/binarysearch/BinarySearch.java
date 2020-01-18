package com.rak.dsa.binarysearch;

public class BinarySearch {
    int binarySearch(int[] nums, int target){
        int low_index = 0;
        int upper_index = nums.length-1;

        while(low_index <= upper_index){
            int mid_index = (upper_index + low_index)/2;
            if(nums[mid_index] == target){
                return mid_index;
            } else if(target < nums[mid_index]){
                upper_index = mid_index -1;
            } else {
                low_index = mid_index + 1;
            }
        }
        return -1;
    }

    int binarySearchRecursive(int[] nums, int target){
        return binarySearchRecursiveSoln(nums, target, 0, nums.length-1);
    }

    private int binarySearchRecursiveSoln(int[] nums, int target, int low_index, int up_index){
        if(low_index > up_index){
            return -1;
        }

        int mid_index = (up_index + low_index)/2;

        if(nums[mid_index] == target){
            return mid_index;
        } else if(target < nums[mid_index]){
            return binarySearchRecursiveSoln(nums, target, low_index, mid_index-1);
        } else {
           return binarySearchRecursiveSoln(nums, target, mid_index+1, up_index);
        }
    }

    int findFirstIndex(int[] nums, int target){
        int index = binarySearchRecursive(nums, target);
        if(index == -1){
            return -1;
        }

        while(nums[index] == target){
            if(index == 0){
                return 0;
            }

            if((nums[index-1]) == target){
                index -= 1;
            } else {
                return index;
            }
        }
        return -1;
    }

    int findFirstIndexRecursive(int[] nums, int target){
        return findFirstIndexRecursiveHelper(nums, target, 0, nums.length - 1);
    }

    private int findFirstIndexRecursiveHelper(int[] nums, int target, int start_index, int end_index){
        if(start_index > end_index){
            return -1;
        }

        int mid_index = (start_index + end_index)/ 2;

        if(nums[mid_index] == target){
            int curr_start_index = findFirstIndexRecursiveHelper(nums, target, start_index, mid_index-1);
            if(curr_start_index == -1){
                return mid_index;
            } else {
                return curr_start_index;
            }
        } else if(target < nums[mid_index]){
            return findFirstIndexRecursiveHelper(nums, target, start_index, mid_index - 1);
        } else {
            return findFirstIndexRecursiveHelper(nums, target, mid_index + 1, end_index);
        }
    }

    int findLastIndexRecursive(int[] nums, int target){
        return findLastIndexRecursiveHelper(nums, target, 0, nums.length - 1);
    }

    private int findLastIndexRecursiveHelper(int[] nums, int target, int start_index, int end_index){
        if(start_index > end_index){
            return -1;
        }

        int mid_index = (start_index + end_index) / 2;

        if(nums[mid_index] == target){
            int curr_end_index = findLastIndexRecursiveHelper(nums, target, mid_index + 1, end_index);
            if(curr_end_index == -1){
                return mid_index;
            } else {
                return curr_end_index;
            }
        } else if(target < nums[mid_index]){
            return findLastIndexRecursiveHelper(nums, target, start_index, mid_index - 1);
        } else {
            return findLastIndexRecursiveHelper(nums, target, mid_index+1, end_index);
        }
    }

    int[] findFirstAndLastIndex(int[] nums, int target){
        int[] output = new int[2];
        output[0] = findFirstIndexRecursive(nums, target);

        output[1] = findLastIndexRecursive(nums, target);

        return output;
    }
}
