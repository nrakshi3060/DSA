package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleNthRowTest {
    private PascalTriangleNthRow pascalTriangleNthRow;

    @BeforeEach
    void setUp() {
        pascalTriangleNthRow = new PascalTriangleNthRow();
    }

    @Test
    void nthRow() {
        System.out.println(pascalTriangleNthRow.nthRow(5));
    }
}