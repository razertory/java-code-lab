package org.razertory.javacodelab.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    private Tree tree;

    @Before
    public void setUp() {
        tree = new Tree();
        this.tree.root = TreeHelper.createTree();
    }

    @Test
    public void addNode() {
    }

    @Test
    public void deleteNode() {
    }

    @Test
    public void maxDepth() {
        Assert.assertEquals(3, tree.maxDepth());
    }

    @Test
    public void minDepth() {
        Assert.assertEquals(3, tree.minDepth());
    }
}