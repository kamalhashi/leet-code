package org.code.challenges.leetcode.bst;

import org.assertj.core.api.Assertions;
import org.code.challenges.leetcode.binarysearchtree.FindMaximumDepth;
import org.code.challenges.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class FindMaximumDepthTest {

    @Test
    void maximumDepthBottomUp() {
        FindMaximumDepth findMaximumDepth = new FindMaximumDepth();
        var result = findMaximumDepth.maximumDepthBottomUp(createDummyBinarySearchTree());
        Assertions.assertThat(result).isEqualTo(3);
    }


    @Test
    void maximumDepthTopDown() {
        FindMaximumDepth findMaximumDepth = new FindMaximumDepth();
        var result = findMaximumDepth.maximumDepthTopDown(createDummyBinarySearchTree());
        Assertions.assertThat(result).isEqualTo(3);
    }


    private TreeNode createDummyBinarySearchTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }
}