package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReturnSubsetsTest {
    ReturnSubsets returnSubsets;

    @BeforeEach
    void setUp() {
        returnSubsets = new ReturnSubsets();
    }

    @Test
    void returnSubsets() {
        returnSubsets.returnSubsets(new int[]{1,2,3});
    }
}