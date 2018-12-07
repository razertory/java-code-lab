package org.razertory.datastructure.dfs;

import org.razertory.datastructure.TreeNode;

import java.util.ArrayList;

public class Tree {
    ArrayList<Integer> order = new ArrayList<>();


    public Integer[] preOrderSearch(TreeNode root){
        if (root != null) {
            order.add(root.value);
            preOrderSearch(root.left);
            preOrderSearch(root.right);
        }
        return order.stream().toArray(Integer[]::new);
    }

    public Integer[] inOrderSearch(TreeNode root){
        if (root != null) {
            inOrderSearch(root.left);
            order.add(root.value);
            inOrderSearch(root.right);
        }
        return order.stream().toArray(Integer[]::new);
    }

    public Integer[] postOrderSearch(TreeNode root){
        if (root != null) {
            postOrderSearch(root.left);
            postOrderSearch(root.right);
            order.add(root.value);
        }
        return order.stream().toArray(Integer[]::new);
    }
}
