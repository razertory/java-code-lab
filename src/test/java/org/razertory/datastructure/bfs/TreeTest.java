package org.razertory.datastructure.bfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.datastructure.TreeNode;

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
        Assert.assertArrayEquals(new Integer[] {1, 5, 8, 7, 9, 3}, tree.bfsSearch(root));
    }
}