package com.rak.dsa.queues;

import com.rak.dsa.linkedlist.SinglyLinkedListNode;

public class QueuesLinkedListImpl implements Queue{
    private SinglyLinkedListNode head = null;
    private SinglyLinkedListNode tail = null;
    private int num_elements = 0;

    public void enqueue(int value){
        if(this.head == null){
            this.head = new SinglyLinkedListNode(String.valueOf(value));
            this.tail = this.head;
        } else {
            this.tail.setNext(new SinglyLinkedListNode(String.valueOf(value)));
            this.tail = this.tail.getNext();
        }
        this.num_elements += 1;
    }

    public int size(){
        return this.num_elements;
    }

    public boolean isEmpty(){
        return this.num_elements == 0;
    }

    public int peek() throws Exception {
        if(this.head == null){
            throw new Exception("Queue is empty");
        }
        return Integer.parseInt(this.head.getValue());
    }

    public int dequeue() throws Exception {
        if(this.head == null){
            throw new Exception("Queue is empty");
        }
        int value = Integer.parseInt(this.head.getValue());
        SinglyLinkedListNode next_node = this.head.getNext();
        this.head.setNext(null);
        this.head = next_node;
        this.num_elements -= 1;
        return value;
    }
}
