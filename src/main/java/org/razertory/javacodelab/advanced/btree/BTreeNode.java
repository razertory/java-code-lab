package org.razertory.javacodelab.advanced.btree;

class BTreeNode {
    int[] keys;
    int t;
    BTreeNode[] children;
    int n;
    boolean leaf;

    BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2*t-1];
        this.children = new BTreeNode[2*t];
    }

    // 遍历算法
    void traverse () {
        int i = 0;
        for (; i < n; i++) {
            if (!leaf) children[i].traverse();
            System.out.println(keys[i]);
        }
        if (!leaf) children[i].traverse();
    }
    // 搜索算法
    BTreeNode search(int key) {
        int i = 0;
        while(i < n && key > keys[i]) i++;
        if (keys[i] == key) return this;
        if (leaf) return null;
        return children[i].search(key);
    }

    void splitChild(int i, BTreeNode y) {}

    void insertNonFull(int key) {}
}
