package com.rak.dsa.heaps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest {
    private Heap heap;
    @BeforeEach
    void setUp() {
        heap = new Heap(5);

        int[] elements = new int[] {1, 2, 3, 4, 1, 2};
        for(Integer element: elements) {
            heap.insert(element);
        }
    }

    @Test
    void insert() {
        for(int i=0; i < heap.cbt.length; i++ ) {
            System.out.print(heap.cbt[i] + " ");
        }

        for(int i=0; i< 4; i ++){
            heap.remove();
        }
        System.out.println("");
        for(int i=0; i < heap.cbt.length; i++ ) {
            System.out.print(heap.cbt[i] + " ");
        }

    }

    @Test
    void remove() {
    }
}