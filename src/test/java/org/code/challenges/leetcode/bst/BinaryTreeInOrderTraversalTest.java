package org.code.challenges.leetcode.bst;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeInOrderTraversalTest {

    @Test
    void inorderTraversalWithRecursion() {
    }

    @Test
    void inOrderTraversalWithStack() {
        var result = BinaryTreeInOrderTraversal.inOrderTraversalWithStack(createDummyBinarySearchTree());
        Assertions.assertThat(result).containsExactly(1,3,2);
    }

    private TreeNode createDummyBinarySearchTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        return root;

    }
}