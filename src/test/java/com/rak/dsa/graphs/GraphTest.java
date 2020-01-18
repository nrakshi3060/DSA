package com.rak.dsa.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    Graph graph1;
    GraphNode nodeG = new GraphNode("G");
    GraphNode nodeR = new GraphNode("R");
    GraphNode nodeA = new GraphNode("A");
    GraphNode nodeP = new GraphNode("P");
    GraphNode nodeH = new GraphNode("H");
    GraphNode nodeS = new GraphNode("S");

    @BeforeEach
    void setUp() {

        graph1 = new Graph(Arrays.asList(nodeG, nodeR, nodeA, nodeP, nodeH, nodeS));
        graph1.addEdge(nodeG,nodeR);
        graph1.addEdge(nodeA,nodeR);
        graph1.addEdge(nodeA,nodeG);
        graph1.addEdge(nodeR,nodeP);
        graph1.addEdge(nodeH,nodeG);
        graph1.addEdge(nodeH,nodeP);
        graph1.addEdge(nodeS,nodeR);
    }

    @Test
    void testDfs() {
        System.out.println("DFS Iterative for Node  G ==> "+graph1.dfs(nodeG));
        System.out.println("DFS Recursive for Node G ==> "+graph1.dfsRecursive(nodeG));
        System.out.println("BFS for Node G ==> "+graph1.bfs(nodeG));
    }
}