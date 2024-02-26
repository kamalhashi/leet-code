package org.code.challenges.leetcode.bst;

import java.text.Normalizer;


//https://leetcode.com/problems/validate-binary-search-tree/editorial/
public class ValidateBinarySearchTree {

    //Approach 1: Top-Down DFS
    public static boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public static boolean validate(TreeNode root, Integer low, Integer high) {


        if (root == null) {
            return true;
        }
        if (low != null && root.val <= low || (high != null && root.val >= high)) {
            return false;
        }
        return validate(root.right, root.val, null) && validate(root.left, null, root.val);
    }

    public static boolean validate(TreeNode root, Integer low, Integer high, String s) {


        if (root == null) {
            return true;
        }

        if (low != null && root.val <= low || (high != null && root.val >= high)) {
            return false;
        }
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}

