package org.razertory.datastructure.bfs;

import org.razertory.datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public void bfsSearch(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
    }
}
