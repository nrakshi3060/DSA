package com.rak.dsa.linkedlist;

class EvenAfterOdd {
    SinglyLinkedListNode evenAfterOdd(SinglyLinkedListNode head){
        if(head == null){
            return null;
        }
        SinglyLinkedListNode curr = head;
        SinglyLinkedListNode even = null;
        SinglyLinkedListNode even_head = null;
        SinglyLinkedListNode odd_head = null;
        SinglyLinkedListNode odd = null;

        while( curr != null){
            if ((Integer.parseInt(curr.value) % 2) != 0){
                if (odd == null){
                    odd = new SinglyLinkedListNode(curr.value);
                    odd_head = odd;
                } else {
                    odd.next = new SinglyLinkedListNode(curr.value);
                    odd = odd.next;
                }
            } else {
                if (even == null){
                    even = new SinglyLinkedListNode(curr.value);
                    even_head = even;
                } else {
                    even.next = new SinglyLinkedListNode(curr.value);
                    even = even.next;
                }
            }
            curr = curr.next;
        }

        if (odd_head == null){
            return even_head;
        } else {
            odd.next = even_head;
            return odd_head;
        }

    }
}
