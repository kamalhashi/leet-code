package org.code.challenges.leetcode.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Pre-order traversal is to visit the root first. Then traverse the left subtree . Finally traverse the right subtree
public class BinaryTreePreOrderTraversal {

    //iterations
    public static List<Integer> preorderTraversalWithLinkedList(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return output;
    }


    public static List<Integer> preorderTraversalWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return output;
    }


    public static List<Integer> preorderTraversalWithRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalWithRecursionHelper(root, result);
        return result;
    }


    //https://www.youtube.com/watch?v=R4V4n-waxn4
    public static void preorderTraversalWithRecursionHelper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preorderTraversalWithRecursionHelper(root.left, result);
        preorderTraversalWithRecursionHelper(root.right, result);
    }
}
