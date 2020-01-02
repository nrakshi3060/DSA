package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class StringPermutationTest {
    StringPermutation stringPermutation;

    @BeforeEach
    void setUp() {
        stringPermutation = new StringPermutation();
    }

    @Test
    void permute() {
        assertThat(stringPermutation.permute("ab")).isEqualTo(Arrays.asList("ab", "ba"));
        assertThat(stringPermutation.permute("abc")).isEqualTo(Arrays.asList("abc", "bac", "bca", "acb", "cab", "cba"));
        assertThat(stringPermutation.permute("abcd")).isEqualTo(Arrays.asList("abcd", "bacd", "bcad", "bcda", "acbd", "cabd", "cbad", "cbda", "acdb", "cadb", "cdab", "cdba", "abdc", "badc", "bdac", "bdca", "adbc", "dabc", "dbac", "dbca", "adcb", "dacb", "dcab", "dcba"));
    }
}