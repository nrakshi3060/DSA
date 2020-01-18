package com.rak.dsa.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    String value;
    List<GraphNode> children = new ArrayList<>();
    List<GraphEdge> edges = new ArrayList<>();

    GraphNode(String value) {
        this.value = value;
    }

    void addChild(GraphNode new_node, int distance) {
        edges.add(new GraphEdge(new_node, distance));
    }

    void removeChild(GraphNode node) {
        edges.remove(node);
    }

}
