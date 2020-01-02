package com.rak.dsa.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaxSumSubarrayTest {
    private MaxSumSubarray maxSumSubarray;

    @BeforeEach
    void setUp() {
        maxSumSubarray = new MaxSumSubarray();
    }

    @Test
    void getMaxSumSubarray() {
        assertThat(maxSumSubarray.getMaxSumSubarray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
        assertThat(maxSumSubarray.getMaxSumSubarray(new int[]{-2})).isEqualTo(-2);
        assertThat(maxSumSubarray.getMaxSumSubarray(new int[]{-2, 0})).isEqualTo(0);
    }

    @Test
    void getMaxSumSubarrayDP() {
        assertThat(maxSumSubarray.getMaxSumSubarrayDP(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})).isEqualTo(6);
        assertThat(maxSumSubarray.getMaxSumSubarrayDP(new int[]{-5})).isEqualTo(-5);
        assertThat(maxSumSubarray.getMaxSumSubarrayDP(new int[]{-5, 1})).isEqualTo(1);
    }
}