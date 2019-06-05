package org.razertory.javacodelab.tree;

import org.razertory.javacodelab.TreeNode;

/**
 * @author springchan
 * @date 2019/2/4
 * @description
 **/
public class TreeHelper {

    /**
     * 固定的二叉树:
     *          1
     *        /   \
     *      5       8
     *    /   \   /
     *  7      9  3
     * ---------------------
     * 先序: 1, 5, 7, 9, 8, 3
     * 中序: 7, 5, 9, 1, 3, 8
     * 后序: 7, 9, 5, 3, 8, 1
     * 层序: 1, 5, 8, 7, 9, 3
     */
    public static TreeNode createTree() {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(8);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(9);
        TreeNode node5 = new TreeNode(3);

        // 第二层
        root.left = node1;
        root.right = node2;

        // 第三层
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        return root;
    }

    /**
     * https://leetcode.com/problems/same-tree
     * 判断两棵树是否完全相同
     */
    public static boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.value == b.value) && isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
    }
}
