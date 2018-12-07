package org.razertory.datastructure.bfs;

import org.razertory.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    ArrayList<Integer> order = new ArrayList<>();

    public Integer[] bfsSearch(TreeNode root) {
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
        return order.stream().toArray(Integer[]::new);
    }
}
