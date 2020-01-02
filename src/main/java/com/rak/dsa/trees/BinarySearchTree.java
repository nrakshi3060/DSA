package com.rak.dsa.trees;

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    private int comparision(Node n1, Node n2){
        return Integer.compare(Integer.parseInt(n1.getValue()), Integer.parseInt(n2.getValue()));
    }

    void insert(int value){
        Node new_node = new Node(String.valueOf(value));
        if(this.root == null){
            this.root = new_node;
        } else {
            insertWithRecursion(new_node, this.root);
        }

    }

    private void insertWithRecursion(Node new_node, Node node){
        int c = comparision(new_node, node);
        if(c == -1){
            if(node.hasLeftChild()){
                insertWithRecursion(new_node, node.getLeft());
            } else {
                node.setLeft(new_node);
            }
        } else if(c == 1){
            if(node.hasRightChild()){
                insertWithRecursion(new_node, node.getRight());
            } else {
                node.setRight(new_node);
            }
        } else {
            node.setValue(new_node.getValue());
        }
    }

    boolean search(int value){
        if (this.root == null){
            return false;
        }

        Node new_node = new Node(String.valueOf(value));
        Node node = this.root;
        while(true){
            int c = comparision(new_node, node);
            if(c == 0){
                return true;
            } else if (c == -1){
                if(node.hasLeftChild()){
                    node = node.getLeft();
                } else {
                    return false;
                }
            } else {
                if(node.hasRightChild()){
                    node = node.getRight();
                } else {
                    return false;
                }
            }
        }
    }



}
