package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringReverseRecursionTest {
    StringReverseRecursion stringReverser;
    @BeforeEach
    void setUp() {
        stringReverser = new StringReverseRecursion();
    }

    @Test
    void reverse() {
        assertThat(stringReverser.reverse("RAK")).isEqualTo("KAR");
        assertThat(stringReverser.reverse("!noitalupinam gnirts gnicitcarP")).isEqualTo("Practicing string manipulation!");
        assertThat(stringReverser.reverse("3432 :si edoc esuoh ehT")).isEqualTo("The house code is: 2343");
    }
}