package org.razertory.javacodelab.bfs;

import org.razertory.javacodelab.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @description BFS 遍历一颗二叉树
 */
public class Tree {
    private ArrayList<Integer> order = new ArrayList<>();

    ArrayList bfsSearch(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                order.add(node.value);
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return order;
    }
}
