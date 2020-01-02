package com.rak.dsa.stacks;

import com.rak.dsa.linkedlist.SinglyLinkedListNode;

public class StackRakLinkedListImpl implements StackRak {
    private SinglyLinkedListNode head;
    private int numElements;

    public StackRakLinkedListImpl() {
        head = null;
        numElements = 0;
    }

    @Override
    public void push(int value) {
        SinglyLinkedListNode new_node = new SinglyLinkedListNode(String.valueOf(value));
        if(this.head == null){
            this.head = new_node;
        } else {
            new_node.setNext(this.head);
            this.head = new_node;
        }
        this.numElements += 1;
    }

    @Override
    public int pop() throws Exception {
        if(this.head == null){
            throw  new Exception("Stack is empty");
        } else {
            SinglyLinkedListNode next_node = this.head.getNext();
            int value = Integer.parseInt(this.head.getValue());
            this.head.setNext(null);
            this.head = next_node;
            this.numElements -= 1;
            return value;
        }
    }

    @Override
    public int size() {
        return this.numElements;
    }

    @Override
    public boolean isEmpty() {
        return this.numElements == 0;
    }
}
