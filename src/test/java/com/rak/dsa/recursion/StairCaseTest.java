package com.rak.dsa.recursion;

import com.rak.dsa.Maps.StaircaseII;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StairCaseTest {
    private StairCase stairCase1;
    private StaircaseII stairCase2;

    @BeforeEach
    void setUp() {
        stairCase1 = new StairCase();
        stairCase2 = new StaircaseII();
    }

    @Test
    void numOfWaysToClimb() {
        assertThat(stairCase1.numOfWaysToClimb(4)).isEqualTo(7);
        assertThat(stairCase1.numOfWaysToClimb(7)).isEqualTo(44);


        assertThat(stairCase2.numberOfWaysToClimbStairs(4)).isEqualTo(7);
        assertThat(stairCase2.numberOfWaysToClimbStairs(7)).isEqualTo(44);

    }
}