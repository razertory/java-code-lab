package org.razertory.javacodelab.advanced.btree;

public class BTree {
    BTreeNode root;
    int t;

    void traverse() {
        if (root != null) root.traverse();
    }

    BTreeNode search(int key) {
        return root == null ? null : root.search(key);
    }

    void insert(int key) {
        if (root == null) {
            root = new BTreeNode(t, false);
            root.keys[0] = key;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                BTreeNode s = new BTreeNode(t, false);
                s.children[0] = root;
                s.splitChild(0, root);
                int i = 0;
                if (s.keys[0] < key) i++;
                s.children[i].insertNonFull(key);
                root = s;
            } else {
                root.insertNonFull(key);
            }
        }
    }
}
