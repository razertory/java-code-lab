package org.razertory.javacodelab.tree;

import org.razertory.javacodelab.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据先序和中序遍历顺序还原一颗二叉树
 * 首先找到 root 节点，然后分别找到子树的 root 节点, 不断递归, 最后返回 root
 */
public class RebuildTree {

    TreeNode rebuildPreIn(int[] preOrder, int[] inOrder){
        Map<Integer, Integer> inPos = new HashMap<>();
        for (int i = 0; i < inOrder.length; i++) {
            inPos.put(inOrder[i], i);
        }
        return buildTree(preOrder, 0, preOrder.length - 1, 0, inPos);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int inStart, Map<Integer, Integer> inPos) {
        if (preStart > preEnd) {
            return null;
        }

        // 构造root节点
        TreeNode root = new TreeNode(preorder[preStart]);

        //找到root节点在inOrder中的位置
        int rootIdx = inPos.get(preorder[preStart]);

        //左子树节点个数
        int leftLen = rootIdx - inStart;

        //构建左子树
        root.left = buildTree(preorder, preStart + 1, preStart + leftLen, inStart, inPos);

        //构建右子树
        root.right = buildTree(preorder, preStart + leftLen + 1, preEnd, rootIdx + 1, inPos);

        return root;
    }
}
