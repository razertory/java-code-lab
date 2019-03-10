package org.razertory.javacodelab.advanced.btree;

// https://www.geeksforgeeks.org/b-tree-set-1-introduction-2
class BTreeNode {
    int[] keys;
    int t;
    BTreeNode[] children;
    int n;
    boolean leaf;

    BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2 * t - 1];
        this.children = new BTreeNode[2 * t];
    }

    // 遍历
    void traverse() {
        int i = 0;
        for (; i < n; i++) {
            if (!leaf) children[i].traverse();
            System.out.println(keys[i]);
        }
        if (!leaf) children[i].traverse();
    }

    // 搜索
    BTreeNode search(int key) {
        int i = 0;
        while (i < n && key > keys[i]) i++;
        if (keys[i] == key) return this;
        if (leaf) return null;
        return children[i].search(key);
    }

    void splitChild(int i, BTreeNode y) {
        BTreeNode z = new BTreeNode(y.t, y.leaf);
        z.n = t - 1;
        for (int j = 0; j < t - 1; j++)
            z.keys[j] = y.keys[j + t];
        if (!y.leaf) {
            for (int j = 0; j < t; j++)
                z.children[j] = y.children[j + t];
        }
        y.n = t - 1;
        for (int j = n; j >= i + 1; j--)
            keys[j + 1] = keys[j];
        keys[i] = y.keys[t - 1];
        n = n + 1;
    }

    void insertNonFull(int key) {
        int i = n - 1;
        if (leaf) {
            while (i >= 0 && keys[i] > key) {
                keys[i + 1] = keys[i];
                i--;
            }
        } else {
            while (i >= 0 && keys[i] > key)
                i--;
            if (children[i + 1].n == 2 * t - 1) {
                splitChild(i + 1, children[i + 1]);
                if (keys[i + 1] < key)
                    i++;
            }
        }
        children[i + 1].insertNonFull(key);
    }
}
