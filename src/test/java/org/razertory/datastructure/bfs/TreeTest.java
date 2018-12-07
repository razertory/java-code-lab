package org.razertory.datastructure.bfs;

import org.junit.Before;
import org.junit.Test;
import org.razertory.datastructure.TreeNode;

import static org.junit.Assert.*;

public class TreeTest {
    private TreeNode root;
    private Tree tree;

    @Before
    public void setup() {
        root = new TreeNode().getDefaultTree();
        tree = new Tree();
    }


    @Test
    public void bfsSearch() {
        tree.bfsSearch(root);
    }
}