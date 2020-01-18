package com.rak.dsa.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Sort012Test {
    Sort012 sort012;

    @BeforeEach
    void setUp() {
        sort012 = new Sort012();
    }

    @Test
    void sort012() {
        int[] nums1 = new int[] {0, 0, 2, 2, 2, 1, 1, 1, 2, 0, 2};
        int[] nums2 = new int[] {2, 1, 2, 0, 0, 2, 1, 0, 1, 0, 0, 2, 2, 2, 1, 2, 0, 0, 0, 2, 1, 0, 2, 0, 0, 1};
        sort012.sort012(nums1);
        sort012.sort012(nums2);

        printArray(nums1);
        System.out.println("\n");
        printArray(nums2);
    }

    private void printArray(int[] nums){
        for(int i: nums){
            System.out.print(i + " ");
        }
    }
}