package org.example.chap4;

import org.example.chap4.prob1.Solver;

public class Node {
    private Node adjacent[];
    public int adjacentCount;
    private String vertex;

    public Solver.State state;

    public Node(String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];
    }

    public void addAdjacent(Node x) {
        if (adjacentCount < adjacent.length) {
            this.adjacent[adjacentCount] = x;
            adjacentCount++;
        } else {
            System.out.println("No more adjacent can ve added");

        }
    }

    public Node[] getAdjacent() {
        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}
