package org.example.chap4.prob1;

import java.util.LinkedList;
import org.example.chap4.Graph;
import org.example.chap4.Node;

public class Solver {
    public enum State {
        Unvisited, Visited, Visiting;
    }

    public static Graph createNewGraph() {
        Graph g = new Graph();

        Node[] tmp = new Node[6];

        tmp[0] = new Node("a", 3);
        tmp[1] = new Node("b", 0);
        tmp[2] = new Node("c", 0);
        tmp[3] = new Node("d", 1);
        tmp[4] = new Node("e", 1);
        tmp[5] = new Node("f", 0);

        tmp[0].addAdjacent(tmp[1]);
        tmp[0].addAdjacent(tmp[2]);
        tmp[0].addAdjacent(tmp[3]);
        tmp[3].addAdjacent(tmp[4]);
        tmp[4].addAdjacent(tmp[5]);

        for (Node node :
                tmp) {
            g.addNode(node);

        }

        return g;
    }

    public static boolean search(Graph g, Node start, Node end) {
        LinkedList<Node> q = new LinkedList<>();

        for (Node u : g.getNodes()
        ) {
            u.state = State.Unvisited;
        }

        start.state = State.Visiting;
        q.add(start);
        Node u;

        while (!q.isEmpty()){
            u = q.removeFirst();

            if (u != null) {
                for (Node v :
                        u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        }else {
                            v.state = State.Visited;
                            q.add(v);
                        }
                    }
                }
            }
        }

        return false;
    }
}
