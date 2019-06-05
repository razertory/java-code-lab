package org.razertory.javacodelab.dfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.javacodelab.TreeNode;
import org.razertory.javacodelab.tree.TreeHelper;

import java.util.Arrays;


public class TreeTest {
    private TreeNode root;
    private Tree tree;

    @Before
    public void setup() {
        root = TreeHelper.createTree();
        tree = new Tree();
    }

    @Test
    public void preOrderSearch() {
        Assert.assertEquals(Arrays.asList(1, 5, 7, 9, 8, 3), tree.preOrderSearch(root));
    }

    @Test
    public void preOrderSearchWithStack() {
        Assert.assertEquals(Arrays.asList(1, 5, 7, 9, 8, 3), tree.preOrderSearchWithStack(root));
    }

    @Test
    public void inOrderSearch() {
        Assert.assertEquals(Arrays.asList(7, 5, 9, 1, 3, 8), tree.inOrderSearch(root));
    }

    @Test
    public void inOrderSearchWithStack() {
        Assert.assertEquals(Arrays.asList(7, 5, 9, 1, 3, 8), tree.inOrderSearchWithStack(root));
    }

    @Test
    public void postOrderSearch() {
        Assert.assertEquals(Arrays.asList(7, 9, 5, 3, 8, 1), tree.postOrderSearch(root));
    }

    @Test
    public void postOrderSearchWithStack() {
        Assert.assertEquals(Arrays.asList(7, 9, 5, 3, 8, 1), tree.postOrderSearchWithStack(root));
    }

}