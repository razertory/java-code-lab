package org.razertory.javacodelab.tree;

import org.junit.Assert;
import org.junit.Test;
import org.razertory.javacodelab.TreeNode;

import static org.junit.Assert.*;

public class RebuildTreeTest {

    @Test
    public void rebuildPreIn() {
        RebuildTree rebuildTree = new RebuildTree();
        int[] preOrder = new int[] {1, 5, 7, 9, 8, 3};
        int[] inOrder = new int[] {7, 5, 9, 1, 3, 8};
        TreeNode expect = TreeHelper.createTree();
        TreeNode actual = rebuildTree.rebuildPreIn(preOrder, inOrder);
        Assert.assertTrue(TreeHelper.isSameTree(expect, actual));
    }
}