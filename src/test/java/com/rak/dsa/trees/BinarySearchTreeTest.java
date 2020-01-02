package com.rak.dsa.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


class BinarySearchTreeTest {
    BinarySearchTree binarySearchTree;

    @BeforeEach
    void setUp() {
        binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(4);
        binarySearchTree.insert(2);

    }

    @Test
    void search() {
        assertThat(binarySearchTree.search(8)).isFalse();
        assertThat(binarySearchTree.search(4)).isTrue();
    }
}