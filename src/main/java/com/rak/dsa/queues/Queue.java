package com.rak.dsa.queues;

import com.rak.dsa.linkedlist.SinglyLinkedListNode;

public interface Queue {
    void enqueue(int value);

    int size();

    boolean isEmpty();

    int peek() throws Exception;

    int dequeue() throws Exception;
}
