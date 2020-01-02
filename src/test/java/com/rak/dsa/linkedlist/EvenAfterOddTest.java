package com.rak.dsa.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EvenAfterOddTest {
    EvenAfterOdd evenAfterOdd;

    @BeforeEach
    void setUp() {
        evenAfterOdd = new EvenAfterOdd();
    }

    @Test
    void evenAfterOdd() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        SinglyLinkedListNode head =  linkedList1.createLinkedList(Arrays.asList( "2", "4","3","5"));
        SinglyLinkedListNode evenAfterHead = evenAfterOdd.evenAfterOdd(head);
        SinglyLinkedList list = new SinglyLinkedList(evenAfterHead);
        assertThat(list.toList()).isEqualTo(Arrays.asList( "3","5","2", "4"));
    }

    @Test
    void evenAfterOdd1() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        SinglyLinkedListNode head =  linkedList1.createLinkedList(Arrays.asList( "2", "4","3"));
        SinglyLinkedListNode evenAfterHead = evenAfterOdd.evenAfterOdd(head);
        SinglyLinkedList list = new SinglyLinkedList(evenAfterHead);
        assertThat(list.toList()).isEqualTo(Arrays.asList( "3","2", "4"));
    }
}