package com.rak.dsa.linkedlist;

public class DetectLoop {
    boolean checkWhetherLoopExistsOrNot(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.getNext().getNext();
            if(slow.getValue().equals(fast.getValue())){
                return true;
            }
        }
        return false;
    }
}
