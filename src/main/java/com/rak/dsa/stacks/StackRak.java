package com.rak.dsa.stacks;

public interface StackRak {
    public void push(int value);

    public int pop() throws Exception;

    public int size();

    public boolean isEmpty();
}
