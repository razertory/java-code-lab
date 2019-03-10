package org.razertory.javacodelab.advanced.btree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BTreeTest {
    private BTree bTree;

    @Before
    public void setup() {
        bTree = new BTree();
        bTree.t = 3;
        bTree.insert(10);
        bTree.insert(20);
        bTree.insert(5);
        bTree.insert(6);
        bTree.insert(12);
        bTree.insert(30);
        bTree.insert(7);
        bTree.insert(17);
    }
    @Test
    public void traverse() {
    }

    @Test
    public void search() {
    }

    @Test
    public void insert() {
    }
}