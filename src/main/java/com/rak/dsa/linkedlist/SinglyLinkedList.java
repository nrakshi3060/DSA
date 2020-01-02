package com.rak.dsa.linkedlist;

import java.util.ArrayList;
import java.util.List;

 class SinglyLinkedList {
    SinglyLinkedListNode head = null;

    SinglyLinkedList() {
     }

     SinglyLinkedList(SinglyLinkedListNode head) {
         this.head = head;
     }

     int size() {

        int count = 0;
        SinglyLinkedListNode curr = this.head;
        while (curr != null) {
            count += 1;
            curr = curr.getNext();
        }
        return count;
    }

     List<String> toList() {
        List<String> output = new ArrayList<>();

        if (this.head != null) {
            SinglyLinkedListNode curr = this.head;

            while (curr != null) {
                output.add(curr.getValue());
                curr = curr.getNext();
            }
        }
        return output;
    }

     void append(String value) {
        if (this.head == null) {
            this.head = new SinglyLinkedListNode(value);
        } else {
            SinglyLinkedListNode curr = this.head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new SinglyLinkedListNode(value));
        }
    }

     void prepend(String value) {
        if (this.head == null) {
            this.head = new SinglyLinkedListNode(value);
        } else {
            SinglyLinkedListNode node = new SinglyLinkedListNode(value);
            node.setNext(this.head);
            this.head = node;
        }
    }

     SinglyLinkedListNode search(String value) throws Exception {
        if (this.head != null) {
            SinglyLinkedListNode curr = this.head;

            while (curr != null) {
                if (curr.getValue().equals(value)) {
                    return curr;
                }
                curr = curr.getNext();
            }

        }
        throw new Exception("Target not found");
    }

     void remove(String value) throws Exception {
        if (this.head != null) {
            if(this.head.getValue().equals(value)){
                pop();
                return;
            }
            SinglyLinkedListNode node = this.head;

            while (node.getNext() != null) {
                if (node.getNext().getValue().equals(value)) {
                    SinglyLinkedListNode temp = node.getNext().getNext();
                    node.getNext().setNext(null);
                    node.setNext(temp);
                    return;
                }
                node = node.getNext();
            }
        }
        throw new Exception("Target not found");
    }

     String pop() {
        if(this.head == null){
            return null;
        } else {
            String value = this.head.getValue();
            SinglyLinkedListNode temp = this.head.getNext();
            this.head.setNext(null);
            this.head = temp;
            return value;
        }
    }

     void insert(String value, int pos){

        if(pos == 0){
            prepend(value);
        } else if(pos >= size()){
            append(value);
        } else {
            int count = 0;
            SinglyLinkedListNode curr = this.head;
            while(curr != null){
                count += 1;
                if (pos == count){
                    SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
                    SinglyLinkedListNode temp = curr.getNext();
                    newNode.setNext(temp);
                    curr.setNext(newNode);
                    return;
                }
                curr = curr.getNext();
            }
        }

    }

    SinglyLinkedListNode createLinkedList(List<String> list){
         for(String item : list){
             if(this.head == null){
                 this.head = new SinglyLinkedListNode(item);
             } else {
                 SinglyLinkedListNode curr = head;
                 while (curr.getNext() != null){
                     curr = curr.getNext();
                 }
                 curr.setNext(new SinglyLinkedListNode(item));
             }
         }
         return this.head;
    }
}
