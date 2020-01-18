package com.rak.dsa.binarysearch;

import com.rak.dsa.binarysearch.BinarySearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Test
    void binarySearch() {
        assertThat(binarySearch.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(4);
        assertThat(binarySearch.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 6)).isEqualTo(6);
        assertThat(binarySearch.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 13)).isEqualTo(-1);
    }

    @Test
    void binarySearchRecursive() {
        assertThat(binarySearch.binarySearchRecursive(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(4);
        assertThat(binarySearch.binarySearchRecursive(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 6)).isEqualTo(6);
        assertThat(binarySearch.binarySearchRecursive(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 13)).isEqualTo(-1);
    }

    @Test
    void findFirst() {
        assertThat(binarySearch.findFirstIndex(new int[]{0, 1, 2, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(3);
        assertThat(binarySearch.findFirstIndex(new int[]{0, 1, 4, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(2);
        assertThat(binarySearch.findFirstIndex(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(0);
        assertThat(binarySearch.findFirstIndex(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 14)).isEqualTo(-1);
        assertThat(binarySearch.findFirstIndex(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 14)).isEqualTo(-1);
    }

    @Test
    void findFirstRecursive() {
        assertThat(binarySearch.findFirstIndexRecursive(new int[]{0, 1, 2, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(3);
        assertThat(binarySearch.findFirstIndexRecursive(new int[]{0, 1, 4, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(2);
        assertThat(binarySearch.findFirstIndexRecursive(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(0);
        assertThat(binarySearch.findFirstIndexRecursive(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 14)).isEqualTo(-1);
        assertThat(binarySearch.findFirstIndexRecursive(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 5)).isEqualTo(5);
    }

    @Test
    void findLastRecursive() {
        assertThat(binarySearch.findLastIndexRecursive(new int[]{0, 1, 2, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(4);
        assertThat(binarySearch.findLastIndexRecursive(new int[]{0, 1, 4, 4, 4, 5, 5, 9}, 5)).isEqualTo(6);
        assertThat(binarySearch.findLastIndexRecursive(new int[]{4, 5, 5, 5, 5, 9}, 5)).isEqualTo(4);
        assertThat(binarySearch.findLastIndexRecursive(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 14)).isEqualTo(-1);
        assertThat(binarySearch.findLastIndexRecursive(new int[]{4, 5, 5, 5, 5, 5}, 5)).isEqualTo(5);
    }

    @Test
    void findFirstAndLastRecursive() {
        assertThat(binarySearch.findFirstAndLastIndex(new int[]{0, 1, 2, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(new int[]{3, 4});
        assertThat(binarySearch.findFirstAndLastIndex(new int[]{0, 1, 4, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(new int[]{2, 4});
        assertThat(binarySearch.findFirstAndLastIndex(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 4)).isEqualTo(new int[]{0, 4});
        assertThat(binarySearch.findFirstAndLastIndex(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 14)).isEqualTo(new int[]{-1, -1});
        assertThat(binarySearch.findFirstAndLastIndex(new int[]{4, 4, 4, 4, 4, 5, 6, 7, 8, 9}, 5)).isEqualTo(new int[]{5, 5});
    }
}