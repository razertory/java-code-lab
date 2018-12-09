package org.razertory.datastructure.dfs;

import org.razertory.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

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

    public Integer[] preOrderSearchWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            order.add(node.value);
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return order.stream().toArray(Integer[]::new);
    }

    public Integer[] inOrderSearchWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            order.add(root.value);
            root = root.right;
        }
        return order.stream().toArray(Integer[]::new);
    }
}
