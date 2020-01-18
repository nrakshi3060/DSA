package com.rak.dsa.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RearrangeArrayElementsTest {

    @Test
    void rearrangeArrayElementsToFormTwoNumbersWhoseSumIsMaximum() {
        RearrangeArrayElements rearrangeArrayElements = new RearrangeArrayElements();
        assertThat(rearrangeArrayElements.rearrangeArrayElementsToFormTwoNumbersWhoseSumIsMaximum(new int[]{1, 2, 3, 4, 5})).containsExactlyInAnyOrder(531, 42);
        assertThat(rearrangeArrayElements.rearrangeArrayElementsToFormTwoNumbersWhoseSumIsMaximum(new int[]{4, 6, 2, 5, 9, 8})).containsExactlyInAnyOrder(964, 852);
    }
}