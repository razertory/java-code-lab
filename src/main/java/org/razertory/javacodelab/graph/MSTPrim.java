package org.razertory.javacodelab.graph;

/**
 * Prim 最小生成树(无向连同带权图)
 * 本质上是贪心算法
 */
public class MSTPrim {
    private int vertexCount;

    public MSTPrim(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    public int[] mst(int[][] matrix) {
        int[] parent = new int[vertexCount];
        int[] key = new int[vertexCount];
        boolean[] mstSet = new boolean[vertexCount];

        for (int i = 1; i < vertexCount; i++) {
            key[i] = Integer.MAX_VALUE;
        }

        for (int count = 0; count < vertexCount - 1; count++) {
            int u = minKey(key, mstSet);

            if (u == -1) continue;

            mstSet[u] = true;

            for (int v = 0; v < vertexCount; v++) {
                if (matrix[u][v] != 0 && !mstSet[v] && matrix[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = matrix[u][v];
                }
            }
        }

        return parent;
    }

    /**
     * 从还未搜过的顶点集合中找到权重最小边所在的顶点
     */
    private int minKey(int[] key, boolean[] mstSet) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < vertexCount; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }

        return minIndex;
    }
}
