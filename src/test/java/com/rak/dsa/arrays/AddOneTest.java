package com.rak.dsa.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddOneTest {
    private AddOne addOne;

    @BeforeEach
    void setUp() {
        addOne = new AddOne();
    }

    @Test
    void addOne() {
        int[]l1 = {1,2,3};
        assertThat(addOne.addOne(l1)).isEqualTo(new int[] {1, 2, 4});
        assertThat(addOne.addOne(new int[] {9, 9, 9})).isEqualTo(new int[] {1,0,0,0});
        assertThat(addOne.addOne(new int[] {0})).isEqualTo(new int[] {1});
        assertThat(addOne.addOne(new int[] {})).isEqualTo(new int[] {});
    }
}