package org.razertory.datastructure.dfs;

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
    public void preOrderSearch() {
        Assert.assertArrayEquals(new Integer[] {1, 5, 7, 9, 8, 3}, tree.preOrderSearch(root));
    }

    @Test
    public void inOrderSearch() {
        Assert.assertArrayEquals(new Integer[] {7, 5, 9, 1, 3, 8}, tree.inOrderSearch(root));
    }

    @Test
    public void orderSearch() {
        Assert.assertArrayEquals(new Integer[] {7, 9, 5, 3, 8, 1}, tree.postOrderSearch(root));
    }

    @Test
    public void preOrderSearchWithStack() {
        Assert.assertArrayEquals(new Integer[] {1, 5, 7, 9, 8, 3}, tree.preOrderSearchWithStack(root));
    }

}