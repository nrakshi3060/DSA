package com.rak.dsa.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringReverserTests {
    private StringReverser stringReverser;

    @BeforeEach
    void setUp() {
        stringReverser = new StringReverser();
    }

    @Test
    void stringReverser() {
       assertThat(stringReverser.stringReverser("RAK")).isEqualTo("KAR");
       assertThat(stringReverser.stringReverser("!noitalupinam gnirts gnicitcarP")).isEqualTo("Practicing string manipulation!");
       assertThat(stringReverser.stringReverser("3432 :si edoc esuoh ehT")).isEqualTo("The house code is: 2343");
    }
}