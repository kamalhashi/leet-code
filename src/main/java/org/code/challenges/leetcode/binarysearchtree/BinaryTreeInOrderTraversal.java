package org.code.challenges.leetcode.binarysearchtree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//in-order traversal is to traverse the left subtree first. Then visit the root,
public class BinaryTreeInOrderTraversal {

    public static List<Integer> inorderTraversalWithRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public static void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

    public static List<Integer> inOrderTraversalWithStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;

        }
        return result;
    }
}
