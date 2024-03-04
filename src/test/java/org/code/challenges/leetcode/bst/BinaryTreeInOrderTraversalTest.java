package org.code.challenges.leetcode.bst;

import static org.junit.jupiter.api.Assertions.*;

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
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        return root;

    }
}