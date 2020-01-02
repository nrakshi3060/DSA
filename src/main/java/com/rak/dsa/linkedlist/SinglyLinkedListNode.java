package com.rak.dsa.linkedlist;

public class SinglyLinkedListNode {
    String value;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(SinglyLinkedListNode next) {
        this.next = next;
    }
}
