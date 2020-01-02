package com.rak.dsa.Maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {
    HashMap hashMap;

    @BeforeEach
    void setUp() {
        hashMap = new HashMap();
    }

    @Test
    void test(){
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("neo", 11);
        hashMap.put("neo1", 11);
        hashMap.put("neo2", 11);
        hashMap.put("neo3", 11);
        hashMap.put("neo4", 11);
        hashMap.put("neo5", 11);
        hashMap.put("neo6", 11);
        hashMap.put("neo6", 11);

        assertThat(hashMap.size()).isEqualTo(10);
        assertThat(hashMap.get("one")).isEqualTo(1);

        hashMap.delete("neo6");

        assertThat(hashMap.size()).isEqualTo(9);
        assertThat(hashMap.get("ne06")).isEqualTo(-1);

    }
}