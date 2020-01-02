package com.rak.dsa.stacks;

public class StackRakArrayImpl implements StackRak {
    private int[] arr;
    private int nextIndex;
    private int numElements;

    public StackRakArrayImpl() {
        arr = new int[10];
        nextIndex = 0;
        numElements = 0;
    }

    public void push(int value) {
        if (numElements > (arr.length - 1)) {
            handleFullCapacity();
        }
        arr[nextIndex] = value;
        nextIndex += 1;
        numElements += 1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        nextIndex -= 1;
        numElements -= 1;
        return arr[nextIndex];
    }

    public int size() {
        return numElements;
    }

    public boolean isEmpty() {
        return numElements == 0;
    }

    private void handleFullCapacity() {
        int[] temp = arr;
        arr = new int[2 * numElements];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

}
