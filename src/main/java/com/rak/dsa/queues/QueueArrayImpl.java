package com.rak.dsa.queues;

public class QueueArrayImpl implements Queue {
    private int[] arr;
    private int next_index;
    private int front_index;
    private int queue_size;

    QueueArrayImpl() {
        this.arr = new int[10];
        this.next_index = 0;
        this.front_index = -1;
        this.queue_size = 0;
    }

    public void enqueue(int value) {
        if (this.queue_size > this.arr.length) {
            handleFullCapacity();
        }
        this.arr[this.next_index] = value;
        this.next_index = (this.next_index + 1) % this.arr.length;
        this.queue_size += 1;
        if (this.front_index == -1){
            this.front_index = 0;
        }
    }

    public int size(){
        return this.queue_size;
    }

    public boolean isEmpty(){
        return this.queue_size == 0;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return this.arr[this.front_index];
    }

    public int dequeue() throws Exception {
        if(this.front_index == -1){
            throw new Exception("Queue is empty");
        }
        int value = this.arr[this.front_index];
        this.queue_size -= 1;
        this.front_index = (this.front_index + 1) % this.arr.length;
        return value;
    }

    private void handleFullCapacity(){
        int[] old_arr = this.arr;
        this.arr = new int[2 * this.queue_size];

        for(int i=0; i < old_arr.length; i++){
            this.arr[i] = old_arr[i];
        }
    }


}
