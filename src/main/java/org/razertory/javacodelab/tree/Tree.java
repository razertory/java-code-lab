package org.razertory.javacodelab.tree;

import org.razertory.javacodelab.TreeNode;

class Tree {

    // 树的根
    TreeNode root;

    // 增加节点
    void addNode(){}

    // 删除节点
    void deleteNode(){}

    // 最大深度
    int maxDepth() {
        return maxDepth(this.root);
    }

    // 最小深度
    int minDepth() {
        return minDepth(this.root);
    }

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    // https://leetcode.com/problems/minimum-depth-of-binary-tree/
    private int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

}
