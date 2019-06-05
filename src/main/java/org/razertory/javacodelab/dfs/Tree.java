package org.razertory.javacodelab.dfs;

import org.razertory.javacodelab.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Tree {
    ArrayList<Integer> order = new ArrayList<>();

    public ArrayList<Integer> preOrderSearch(TreeNode root){
        if (root != null) {
            order.add(root.value);
            preOrderSearch(root.left);
            preOrderSearch(root.right);
        }
        return order;
    }

    public ArrayList<Integer> preOrderSearchWithStack(TreeNode root){
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
        return order;
    }

    public ArrayList<Integer> inOrderSearch(TreeNode root){
        if (root != null) {
            inOrderSearch(root.left);
            order.add(root.value);
            inOrderSearch(root.right);
        }
        return order;
    }

    public ArrayList<Integer> inOrderSearchWithStack(TreeNode root){
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
        return order;
    }

    public ArrayList<Integer> postOrderSearch(TreeNode root){
        if (root != null) {
            postOrderSearch(root.left);
            postOrderSearch(root.right);
            order.add(root.value);
        }
        return order;
    }

    public ArrayList<Integer> postOrderSearchWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode peak = stack.peek();
            order.add(peak.value);
            stack.pop();
            if (peak.left != null) {
               stack.push(peak.left);
            }

            if (peak.right != null) {
                stack.push(peak.right);
            }
        }
        Collections.reverse(order);
        return order;
    }
}
