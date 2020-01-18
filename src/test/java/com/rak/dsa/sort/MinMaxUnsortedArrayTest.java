package com.rak.dsa.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinMaxUnsortedArrayTest {

    @Test
    void getMinMax() {
        MinMaxUnsortedArray minMaxUnsortedArray = new MinMaxUnsortedArray();
        assertThat(minMaxUnsortedArray.getMinMax(new int[]{9,3,2,4,6})).containsExactlyInAnyOrder(9,2);
        assertThat(minMaxUnsortedArray.getMinMax(new int[]{})).containsExactlyInAnyOrder(0,0);
    }
}