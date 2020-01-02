package com.rak.dsa.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HammingDistanceTest {
    private HammingDistance hammingDistance;

    @BeforeEach
    void setUp() {
        hammingDistance = new HammingDistance();
    }

    @Test
    void findHammingDistance() {
        assertThat(hammingDistance.findHammingDistance("ACTTGACCGGG","GATCCGGTACA")).isEqualTo(10);
        assertThat(hammingDistance.findHammingDistance("shove","stove")).isEqualTo(1);
        assertThat(hammingDistance.findHammingDistance("Slot machines","Cash lost in me")).isEqualTo(0);
        assertThat(hammingDistance.findHammingDistance("A gentleman","Elegant men")).isEqualTo(9);
        assertThat(hammingDistance.findHammingDistance("0101010100011101","0101010100010001")).isEqualTo(2);
    }
}