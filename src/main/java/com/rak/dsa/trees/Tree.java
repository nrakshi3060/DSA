package com.rak.dsa.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Tree {
    private Node root;

    public Tree() {
        this.root = null;
    }

    public Tree(String value) {
        this.root = new Node(value);
    }

    public Node getRoot() {
        return root;
    }

    public List<String> dfsPreOrder(){
        List<String> visitOrder = new ArrayList<>();
        traversePreOrder(this.root, visitOrder);
        return visitOrder;
    }

    private void traversePreOrder(Node node, List<String> visitOrder){
        if(node != null){
            visitOrder.add(node.getValue());

            traversePreOrder(node.getLeft(), visitOrder);

            traversePreOrder(node.getRight(), visitOrder);
        }
    }

    public List<String> dfsInOrder(){
        List<String> visitOrder = new ArrayList<>();
        traverseInOrder(this.root, visitOrder);
        return visitOrder;
    }

    private void traverseInOrder(Node node, List<String> visitOrder){
        if(node != null){
            traverseInOrder(node.getLeft(), visitOrder);

            visitOrder.add(node.getValue());

            traverseInOrder(node.getRight(), visitOrder);
        }
    }

    public List<String> dfsPostOrder(){
        List<String> visitOrder = new ArrayList<>();
        traversePostOrder(this.root, visitOrder);
        return visitOrder;
    }

    private void traversePostOrder(Node node, List<String> visitOrder){
        if(node != null){
            traversePostOrder(node.getLeft(), visitOrder);

            traversePostOrder(node.getRight(), visitOrder);

            visitOrder.add(node.getValue());
        }
    }

     List<String> bfs(){
        List<String> visitOrder = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(this.root);

        while(q.size() > 0){
           Node node = q.remove();
           visitOrder.add(node.getValue());
           if(node.hasLeftChild()){
               q.add(node.getLeft());
           }
           if(node.hasRightChild()){
               q.add(node.getRight());
           }
        }
        return visitOrder;
    }

    int findDiameter(){
        return findDiameterFunc(this.root).diameter;
    }

    Daimeter findDiameterFunc(Node node){
        if(node == null){
            return new Daimeter(0, 0);
        }

        Daimeter leftDiameter = findDiameterFunc(node.getLeft());
        Daimeter rightDaimeter = findDiameterFunc(node.getRight());

        int current_height = Math.max(leftDiameter.height, rightDaimeter.height) + 1;
        int height_diameter = leftDiameter.height + rightDaimeter.height;
        int current_diameter = Math.max(leftDiameter.diameter, rightDaimeter.diameter);
        current_diameter = Math.max( height_diameter, current_diameter);
        return new Daimeter(current_diameter, current_height);
    }

    class Daimeter{
        private int diameter;
        private int height;

        public Daimeter(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }

        public int getDiameter() {
            return diameter;
        }

        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
    }
}
