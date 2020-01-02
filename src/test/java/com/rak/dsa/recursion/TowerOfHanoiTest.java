package com.rak.dsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {
    private TowerOfHanoi towerOfHanoi;

    @BeforeEach
    void setUp() {
        towerOfHanoi = new TowerOfHanoi();
    }

    @Test
    void printSteps() {
        towerOfHanoi.printSteps(2);
        System.out.println("--------------------");
        towerOfHanoi.printSteps(3);
        System.out.println("--------------------");
        towerOfHanoi.printSteps(4);
        System.out.println("--------------------");
//        towerOfHanoi.printSteps(1000);
//        System.out.println("--------------------");
    }
}