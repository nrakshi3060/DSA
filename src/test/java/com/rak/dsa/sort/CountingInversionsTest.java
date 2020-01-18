package com.rak.dsa.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountingInversionsTest {
    private CountingInversions countingInversions;
    @BeforeEach
    void setUp() {
        countingInversions = new CountingInversions();
    }

    @Test
    void countInversion() {
        assertThat(countingInversions.countInversion(new int[]{2, 5, 1, 3, 4})).isEqualTo(4);
        assertThat(countingInversions.countInversion(new int[]{54, 99, 49, 22, 37, 18, 22, 90, 86, 33})).isEqualTo(26);
        assertThat(countingInversions.countInversion(new int[]{54, 99, 49, 22, 37, 18, 22, 90, 86, 33})).isEqualTo(26);
        assertThat(countingInversions.countInversion(new int[]{1, 2, 4, 2, 3, 11, 22, 99, 108, 389})).isEqualTo(2);
    }
}