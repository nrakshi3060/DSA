package com.rak.dsa.Maps;

import com.rak.dsa.linkedlist.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    private int capacity;
    private Map<Integer, DoublyLinkedListNode> map = new HashMap<>(capacity);
    private DoublyLinkedListNode head = null;
    private DoublyLinkedListNode tail = null;

    public LRU(int capacity) {
        this.capacity = capacity;
    }

    public void put(int key, int value){
        if(this.map.containsKey(key)){
            DoublyLinkedListNode node = map.get(key);
            node.setValue(value);
            removeNode(node);
            addNodeAtTop(node);
        } else {
            DoublyLinkedListNode new_node = new DoublyLinkedListNode(key, value);
            if(map.size() < capacity){
                addNodeAtTop(new_node);
            } else {
                map.remove(tail.getKey());
                removeNode(tail);
                addNodeAtTop(new_node);
            }
            map.put(key, new_node);
        }
    }

    public int get(int key){
        if(map.containsKey(key)){
            DoublyLinkedListNode node = map.get(key);
            removeNode(node);
            addNodeAtTop(node);
            return node.getValue();
        } else {
            return -1;
        }
    }

    private void removeNode(DoublyLinkedListNode node){
        DoublyLinkedListNode prev_node = node.getPrev();
        DoublyLinkedListNode next_node = node.getNext();

        if(prev_node != null){
            prev_node.setNext(next_node);
        } else {
            head = next_node;
        }

        if(next_node != null){
            next_node.setPrev(prev_node);
        } else {
            tail = prev_node;
        }
    }

    private void addNodeAtTop(DoublyLinkedListNode node){
        node.setNext(head);
        if(head != null){
            head.setPrev(node);
        }
        head = node;

        if(tail == null){
            tail = head;
        }
    }
}
