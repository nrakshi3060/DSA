package com.rak.dsa.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
    }

    @Test
    void sortArray() {
        System.out.println(mergeSort.sortArray(new int[] {5,2,3,1}));
        System.out.println(mergeSort.sortArray(new int[] {-2,3,-5}));
    }
}