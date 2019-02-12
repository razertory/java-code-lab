package org.razertory.javacodelab.graph.matrix;


/*
 * 图的临接矩阵表示法
 * 矩阵中，大于 0 表示节点相连，-1 表示不相连, 0 表示相同节点
 */
public class MGraph {
    int[][] map;

    public MGraph(int size) {
        this.map = new int[size][size];
    }

    public void addEdge(int start, int end) {
        this.map[start][end] = 1;
    }

    public void deleteEdge(int start, int end) {
        this.map[start][end] = -1;
    }

    public void addEdge(int start, int end, int value) {
        this.map[start][end] = value;
    }
}
