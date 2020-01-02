package com.rak.dsa.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();

    }

    @Test
    void reverse() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        SinglyLinkedListNode head =  linkedList1.createLinkedList(Arrays.asList("1", "2", "3", "4", "5"));
        SinglyLinkedListNode reversedHead = reverseLinkedList.reverse(head);
        SinglyLinkedList reversedLinkedList = new SinglyLinkedList(reversedHead);
        assertThat(reversedLinkedList.toList()).isEqualTo(Arrays.asList("5","4","3","2", "1"));
    }

    @Test
    void reverse1() {
        SinglyLinkedListNode head =  null;
        SinglyLinkedListNode reversedHead = reverseLinkedList.reverse(head);
        assertThat(reversedHead).isEqualTo(null);
    }
}