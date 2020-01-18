package com.rak.dsa.Maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LongestConsecutiveSubsequenceTest {
    private LongestConsecutiveSubsequence longestConsecutiveSubsequence;
    @BeforeEach
    void setUp() {
        longestConsecutiveSubsequence = new LongestConsecutiveSubsequence();
    }

    @Test
    void longestConsecutiveSubsequence() {

        assertThat(longestConsecutiveSubsequence.findLongestConsecutiveSubsequence(new int[]{5, 4, 7, 10, 1, 3, 55, 2})).isEqualTo(Arrays.asList(1, 2, 3, 4, 5));
        assertThat(longestConsecutiveSubsequence.findLongestConsecutiveSubsequence(new int[]{2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6})).isEqualTo(Arrays.asList(8, 9, 10, 11, 12));
        assertThat(longestConsecutiveSubsequence.findLongestConsecutiveSubsequence(new int[]{0, 1, 2, 3, 4})).isEqualTo(Arrays.asList(0, 1, 2, 3, 4));
    }
}