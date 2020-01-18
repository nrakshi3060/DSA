package com.rak.dsa.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    Sqrt sqrt;

    @BeforeEach
    void setUp() {
        sqrt = new Sqrt();
    }

    @Test
    void findSqrt() {
        assertThat(sqrt.findSqrt(9)).isEqualTo(3);
        assertThat(sqrt.findSqrt(27)).isEqualTo(5);

        System.out.println(1%2);
    }
}