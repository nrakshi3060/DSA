package com.rak.dsa.heaps;

public class Heap {
    int[] cbt;
    private int next_index;

    Heap(int initialCapacity){
        cbt = new int[initialCapacity];
    }

    void insert(int value){
        this.cbt[next_index] = value;

        this.upHeapify();
        this.next_index += 1;

        if(this.next_index >= cbt.length){
            int[] old_cbt = this.cbt;
            this.cbt = new int[2*old_cbt.length];
            for(int i=0; i < old_cbt.length; i++){
                cbt[i] = old_cbt[i];
            }
        }
    }

    private void upHeapify(){
        int child_index = next_index;

        while(child_index >= 1){
            int parent_index = (child_index - 1)/ 2 ;
            int parent_element = cbt[parent_index];
            int child_element = cbt[child_index];

            if(child_element < parent_element){
                cbt[child_index] = parent_element;
                cbt[parent_index] = child_element;
                child_index = parent_index;
            } else {
                break;
            }
        }
    }

    int remove(){
        next_index -= 1;
        int last_element = this.cbt[next_index];
        int to_remove = this.cbt[0];

        this.cbt[0] = last_element;
        this.cbt[next_index] = to_remove;
        downHeapify();
        return to_remove;
    }

    private void downHeapify(){
        int parent_index = 0;

        while(parent_index < this.next_index){
            int left_child_index = 2 * parent_index + 1;
            int right_child_index = 2 * parent_index + 2;
            int parent_element = this.cbt[parent_index];
            Integer left_child_element = null;
            Integer right_child_element = null;

            if(left_child_index < this.next_index){
                left_child_element = this.cbt[left_child_index];
            }

            if(right_child_index < this.next_index){
                right_child_element = this.cbt[right_child_index];
            }

            int min_element = parent_element;

            if(left_child_element != null){
                min_element = Math.min(min_element, left_child_element);
            }

            if(right_child_element != null){
                min_element = Math.min(min_element, right_child_element);
            }

            if(min_element == parent_element){
                return;
            } else if(left_child_element != null && min_element == left_child_element){
                cbt[left_child_index] = parent_element;
                cbt[parent_index] = left_child_element;
                parent_index = left_child_index;
            } else {
                cbt[right_child_index] = parent_element;
                cbt[parent_index] = right_child_element;
                parent_index = right_child_index;
            }

        }
    }

    int size(){
        return this.next_index;
    }

    boolean isEmpty(){
        return this.size() == 0;
    }

    int getMinimum() throws Exception{
        if(size() == 0){
            throw new Exception("Queue is empty");
        } else {
            return cbt[0];
        }
    }
}
