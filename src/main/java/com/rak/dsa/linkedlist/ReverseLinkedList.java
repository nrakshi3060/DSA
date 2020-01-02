package com.rak.dsa.linkedlist;

public class ReverseLinkedList {
    SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        if (head == null) {
            return null;
        }

        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode new_node = null;
        SinglyLinkedListNode next_node = null;

        while (curr != null) {
            next_node = curr.next;
            curr.next = new_node;
            new_node = curr;
            curr = next_node;
        }

        return new_node;
    }
}
