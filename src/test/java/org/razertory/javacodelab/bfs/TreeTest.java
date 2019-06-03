package org.razertory.javacodelab.bfs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.razertory.javacodelab.TreeNode;
import org.razertory.javacodelab.tree.TreeHelper;

import java.util.ArrayList;
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
    public void bfsSearch() {
        ArrayList expect = new ArrayList<>(Arrays.asList(1, 5, 8, 7, 9, 3));
        Assert.assertEquals(expect, tree.bfsSearch(root));
    }
}