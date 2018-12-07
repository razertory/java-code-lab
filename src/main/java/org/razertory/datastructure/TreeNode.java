package org.razertory.datastructure;


public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(){}

    public TreeNode(int value) {
        this.value = value;
    }

    // 返回一个固定二叉树的 root，二叉树如图
    //                 1
    //               /   \
    //             5       8
    //           /   \   /   \
    //         7      9  3
    public TreeNode getDefaultTree() {
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
