package org.razertory.datastructure.graph.matrix;


public class MGraph {
    int[][] map;

    public MGraph(int size) {
        this.map = new int[size][size];
    }

    public void addEdge(int start, int end) {
        this.map[start][end] = 1;
    }

    public void deleteEdge(int start, int end) {
        this.map[start][end] = 0;
    }
}
