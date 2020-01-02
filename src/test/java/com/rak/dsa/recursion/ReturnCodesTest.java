package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReturnCodesTest {
    ReturnCodes returnCodes;

    @BeforeEach
    void setUp() {
        returnCodes = new ReturnCodes();
    }

    @Test
    void returnAllCodes() {
        assertThat(returnCodes.returnAllCodes(123)).containsExactlyInAnyOrder("abc", "aw", "lc");
    }
}