package org.code.challenges.leetcode.binarytree;


public class ValidBinaryTree {

    //Approach 1 :Top Down DFS

    public boolean isValidBSTDFS(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            System.out.println("*********");
            System.out.println("root value :" + root.val);
            System.out.println("low :" + low);
            System.out.println("high :" + high);
            System.out.print("*********");
            return true;
        }

        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }


    }
}
