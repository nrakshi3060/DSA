package com.rak.dsa.graphs;

import java.util.*;

public class Graph {
    List<GraphNode> nodes;

    public Graph(List<GraphNode> nodes) {
        this.nodes = nodes;
    }

    void addEdge(GraphNode node1, GraphNode node2) {
        if (this.nodes.contains(node1) && this.nodes.contains(node2)) {
            node1.children.add(node2);
            node2.children.add(node1);
        }
    }

    void removeEdge(GraphNode node1, GraphNode node2) {
        if (nodes.contains(node1) && nodes.contains(node2)) {
            node1.children.remove(node2);
            node2.children.remove(node1);
        }
    }

    void addEdge(GraphNode node1, GraphNode node2, int distance) {
        if (this.nodes.contains(node1) && this.nodes.contains(node2)) {
            node1.addChild(node2, distance);
            node2.addChild(node1, distance);
        }
    }

    List<String> dfs(GraphNode start_node) {
        Stack<GraphNode> graphNodeStack = new Stack<>();
        graphNodeStack.push(start_node);
        List<String> visited = new ArrayList<>();

        while (!graphNodeStack.isEmpty()) {
            GraphNode curr = graphNodeStack.pop();

            if (!visited.contains(curr.value)) {
                visited.add(curr.value);
            }

            for (GraphNode node : curr.children) {
                if (!visited.contains(node.value)) {
                    graphNodeStack.add(node);
                }
            }
        }

        return visited;
    }

    List<String> dfsRecursive(GraphNode start_node) {
        List<String> visited = new ArrayList<>();
        dfsRecursiveFunc(start_node, visited);
        return visited;
    }

    private void dfsRecursiveFunc(GraphNode node, List<String> visited) {

        if (node == null) {
            return;
        }

        if (!visited.contains(node.value)) {
            visited.add(node.value);
        }

        for (GraphNode curr : node.children) {
            if (!visited.contains(curr.value)) {
                dfsRecursiveFunc(curr, visited);
            }
        }

    }

    List<String> bfs(GraphNode start_node) {
        List<String> visited = new ArrayList<>();
        Queue<GraphNode> queue = new ArrayDeque<>();
        queue.add(start_node);

        while (!queue.isEmpty()) {
            GraphNode curr = queue.remove();

            if (!visited.contains(curr.value)) {
                visited.add(curr.value);
            }

            for (GraphNode node : curr.children) {
                if (!visited.contains(node.value)) {
                    queue.add(node);
                }
            }
        }

        return visited;
    }


}
