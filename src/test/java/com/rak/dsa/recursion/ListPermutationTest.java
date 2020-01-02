package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListPermutationTest {
    ListPermutation listPermutation;

    @BeforeEach
    void setUp() {
        listPermutation = new ListPermutation();
    }

    @Test
    void permute() {
        listPermutation.permute(new int[] {1, 2, 3});
    }
}