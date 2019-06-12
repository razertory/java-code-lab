package org.razertory.javacodelab.graph.matrix;


/*
 * 图的临接矩阵表示法
 * 矩阵中，大于 0 表示节点相连， 0 表示不相连
 */
public class MGraph {
    public int[][] map;

    public MGraph(int size) {
        this.map = new int[size][size];
    }

    public void deleteEdge(int start, int end) {
        this.map[start][end] = 0;
    }

    public void addEdge(int start, int end, int value) {
        this.map[start][end] = value;
    }
}
