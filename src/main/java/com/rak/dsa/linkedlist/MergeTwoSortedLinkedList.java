package com.rak.dsa.linkedlist;

public class MergeTwoSortedLinkedList {
    public SinglyLinkedListNode mergeTwoLists(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {

        if(l1 == null){
            return l2;
        }

        if (l2 == null){
            return l1;
        }

        SinglyLinkedListNode l1_node = l1;
        SinglyLinkedListNode l2_node = l2;

        SinglyLinkedList merged = new SinglyLinkedList();

        while (l1_node != null || l2_node != null){
            if(l1_node == null){
                merged.append(l2_node.value);
                l2_node = l2_node.next;
            } else if (l2_node == null){
                merged.append(l1_node.value);
                l1_node = l1_node.next;
            } else if (Integer.parseInt(l1_node.value) < Integer.parseInt(l2_node.value)){
                merged.append(l1_node.value);
                l1_node = l1_node.next;
            } else {
                merged.append(l2_node.value);
                l2_node = l2_node.next;
            }
        }
        return merged.head;
    }
}
