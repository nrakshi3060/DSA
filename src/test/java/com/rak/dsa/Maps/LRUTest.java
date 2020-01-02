package com.rak.dsa.Maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUTest {
    LRU our_cache;
    @BeforeEach
    void setUp() {
    }

    @Test
    void testLRU() {
        our_cache = new LRU(5);

        our_cache.put(1, 1);
        our_cache.put(2, 2);
        our_cache.put(3, 3);
        our_cache.put(4, 4);


        System.out.println(our_cache.get(1));
        System.out.println(our_cache.get(2));
        System.out.println(our_cache.get(9));

        our_cache.put(5, 5);
        our_cache.put(6, 6);

        System.out.println(our_cache.get(3));
    }
}