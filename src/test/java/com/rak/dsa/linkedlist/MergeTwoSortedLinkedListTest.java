package com.rak.dsa.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;


class MergeTwoSortedLinkedListTest {
    private MergeTwoSortedLinkedList mergeTwoSortedLinkedList;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLinkedList = new MergeTwoSortedLinkedList();
    }

    @Test
    void mergeTwoLists() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        SinglyLinkedListNode head1 =  linkedList1.createLinkedList(Arrays.asList("1", "2", "4"));
        SinglyLinkedListNode head2 =  linkedList2.createLinkedList(Arrays.asList("1", "3", "4"));
        SinglyLinkedListNode mergedHead = mergeTwoSortedLinkedList.mergeTwoLists(head1, head2);
        SinglyLinkedList mergedList = new SinglyLinkedList(mergedHead);
        assertThat(mergedList.toList()).isEqualTo(Arrays.asList("1", "1", "2", "3", "4", "4"));
    }

    @Test
    void mergeTwoLists1() {
        SinglyLinkedList linkedList2 = new SinglyLinkedList();
        SinglyLinkedListNode head1 = null;
        SinglyLinkedListNode head2 =  linkedList2.createLinkedList(Arrays.asList("1", "3", "4"));
        SinglyLinkedListNode mergedHead = mergeTwoSortedLinkedList.mergeTwoLists(head1, head2);
        SinglyLinkedList mergedList = new SinglyLinkedList(mergedHead);
        assertThat(mergedList.toList()).isEqualTo(Arrays.asList("1", "3", "4"));
    }

    @Test
    void mergeTwoLists2() {
        SinglyLinkedList linkedList1 = new SinglyLinkedList();
        SinglyLinkedListNode head1 =  linkedList1.createLinkedList(Arrays.asList("1", "2", "4"));
        SinglyLinkedListNode head2 =  null;
        SinglyLinkedListNode mergedHead = mergeTwoSortedLinkedList.mergeTwoLists(head1, head2);
        SinglyLinkedList mergedList = new SinglyLinkedList(mergedHead);
        assertThat(mergedList.toList()).isEqualTo(Arrays.asList("1", "2", "4"));
    }

    @Test
    void mergeTwoLists3() {
        SinglyLinkedListNode head1 =  null;
        SinglyLinkedListNode head2 =  null;
        SinglyLinkedListNode mergedHead = mergeTwoSortedLinkedList.mergeTwoLists(head1, head2);
        SinglyLinkedList mergedList = new SinglyLinkedList(mergedHead);
        assertThat(mergedList.toList()).isEqualTo(Collections.emptyList());
    }

}