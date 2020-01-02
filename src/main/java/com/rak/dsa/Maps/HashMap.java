package com.rak.dsa.Maps;

import java.util.ArrayList;

public class HashMap {
    private int num_entries = 0;
    private LinkedListNode[] bucketArray;
    private int prime_number = 37;
    private double load_factor = 0.7;

    public HashMap() {
        bucketArray = new LinkedListNode[10];
    }

    public HashMap(int initialCapacity) {
        bucketArray = new LinkedListNode[initialCapacity];
    }

    public int get(String key){
        int bucket_index = getHashCode(key);
        LinkedListNode node = bucketArray[bucket_index];

        while(node != null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return -1;
    }

    public int size(){
        return num_entries;
    }

    public void put(String key, int value){
        int bucket_index = getHashCode(key);
        LinkedListNode new_node = new LinkedListNode(value, key);
        LinkedListNode node = bucketArray[bucket_index];

        while(node != null){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
            node = node.next;
        }

        node = bucketArray[bucket_index];
        new_node.next = node;
        bucketArray[bucket_index] = new_node;
        num_entries += 1;

        double curr_load_factor = (num_entries/ bucketArray.length);

        if (curr_load_factor > load_factor){
            performRehashing();
        }

    }

    public void delete(String key){
        int bucket_index = getHashCode(key);
        LinkedListNode node = bucketArray[bucket_index];
        LinkedListNode prev = null;
        while(node != null){
            if(node.key.equals(key)){
                if(prev == null){
                    bucketArray[bucket_index] = node.next;
                    node.next = null;
                } else {
                    prev.next = node.next;
                    node.next = null;
                }
                num_entries -= 1;
                return;
            } else {
                prev = node;
                node = node.next;
            }
        }
    }

    private void performRehashing(){
        LinkedListNode[] old_bucket_array = bucketArray;
        bucketArray = new LinkedListNode[old_bucket_array.length * 2];
        num_entries = 0;

        for(LinkedListNode item: old_bucket_array){

            while(item != null){
                put(item.key, item.value);
                item = item.next;
            }
        }
    }

    private int getHashCode(String key){
        int hashCode = 0;
        int curr_coeff = 1;
        for(char c: key.toCharArray()){
            hashCode += (int)c * curr_coeff;
            hashCode %= bucketArray.length;
            curr_coeff *= this.prime_number;
            curr_coeff %= bucketArray.length;
        }
        return hashCode % bucketArray.length;
    }

    class LinkedListNode{
        int value;
        String key;
        LinkedListNode next = null;

        public LinkedListNode(int value, String key) {
            this.value = value;
            this.key = key;
        }
    }
}
