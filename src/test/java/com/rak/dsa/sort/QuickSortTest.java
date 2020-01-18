package com.rak.dsa.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    QuickSort quickSort;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    void quickSort() {
        int[] nums1 = new int[] {5,2,3,1};
        int[] nums2 = new int[] {-2,3,-5};
        quickSort.sortArray(nums1);
        quickSort.sortArray(nums2);
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