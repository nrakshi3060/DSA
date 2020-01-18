package com.rak.dsa.graphs;

public class GraphEdge {
    GraphNode graphNode;
    int distance;

    public GraphEdge(GraphNode graphNode, int distance) {
        this.graphNode = graphNode;
        this.distance = distance;
    }
}
