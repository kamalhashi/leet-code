package org.code.challenges.leetcode.binarysearchtree;

public class FindMaximumDepth {
    private int answer = Integer.MIN_VALUE;
    //post order
    public int maximumDepthBottomUp(TreeNode root) {
        if (root == null) {
            return 0;                                   // return 0 for null node
        }
        int left_depth = maximumDepthBottomUp(root.left);
        int right_depth = maximumDepthBottomUp(root.right);
        return Math.max(left_depth, right_depth) + 1;   // return depth of the subtree rooted at root
    }


    //preorder
    public int maximumDepthTopDown(TreeNode root) {
        int[] answer = new int[1]; // Initialize an array to hold the maximum depth
        findDepth(root, 1, answer); // Call the helper method starting from depth 0
        return answer[0]; // Return the maximum depth stored in the answer variable
    }


    private void findDepth(TreeNode node, int depth, int[] answer) {
        if (node == null) {
            return;
        }
//        // Update the answer if the current depth is greater than the stored maximum depth
//        if (depth > answer[0]) {
//            answer[0] = depth;
//        }

        if (node.left == null && node.right == null) {
            answer[0] = Math.max(answer[0], depth);
        }
        // Recursively traverse the left and right subtrees
        findDepth(node.left, depth + 1, answer);
        findDepth(node.right, depth + 1, answer);
    }

}
