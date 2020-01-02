package com.rak.dsa.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TreeTest {
    private Tree tree;

    @BeforeEach
    void setUp() {
        tree = new Tree("apple");
        tree.getRoot().setLeft(new Node("banana"));
        tree.getRoot().setRight(new Node("cherry"));
        tree.getRoot().getLeft().setLeft(new Node("dates"));
    }

    @Test
    void dfsPreOrder() {
        assertThat(tree.dfsPreOrder()).isEqualTo(Arrays.asList("apple", "banana", "dates", "cherry"));
    }

    @Test
    void dfsInOrder() {
        assertThat(tree.dfsInOrder()).isEqualTo(Arrays.asList("dates", "banana", "apple", "cherry"));
    }

    @Test
    void dfsPostOrder() {
        assertThat(tree.dfsPostOrder()).isEqualTo(Arrays.asList("dates", "banana", "cherry", "apple"));
    }

    @Test
    void bfs() {
        assertThat(tree.bfs()).isEqualTo(Arrays.asList("apple", "banana", "cherry", "dates"));
    }

    @Test
    void diameter() {
        assertThat(tree.findDiameter()).isEqualTo(3);
    }
}