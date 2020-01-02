package com.rak.dsa.trees;

public class Node {
    private String value;
    private Node right;
    private Node left;

    public Node() {
        this.value = null;
        this.left = null;
        this.right = null;
    }

    public Node(String value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public boolean hasLeftChild(){
        return this.left != null;
    }

    public  boolean hasRightChild(){
        return this.right != null;
    }
}
