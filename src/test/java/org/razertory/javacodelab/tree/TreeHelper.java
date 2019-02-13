package org.razertory.javacodelab.tree;

import org.razertory.javacodelab.TreeNode;

/**
 * @author springchan
 * @date 2019/2/4
 * @description
 **/
public class TreeHelper {

    // 返回一个固定二叉树
    //                 1
    //               /   \
    //             5       8
    //           /   \   /
    //         7      9  3
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
}
