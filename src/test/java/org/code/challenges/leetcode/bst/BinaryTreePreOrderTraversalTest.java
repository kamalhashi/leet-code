package org.code.challenges.leetcode.bst;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreePreOrderTraversalTest {

    @Test
    public void preorderTraversalWithLinkedList() {
        var result = BinaryTreePreOrderTraversal.preorderTraversalWithLinkedList(createDummyBinarySearchTree());
        Assertions.assertThat(result).containsExactly(5, 3, 2, 4, 8, 6, 9);
    }

    @Test
    public void preorderTraversalWithStack() {
        var result = BinaryTreePreOrderTraversal.preorderTraversalWithStack(createDummyBinarySearchTree());
        Assertions.assertThat(result).containsExactly(5, 3, 2, 4, 8, 6, 9);
    }

    @Test
    public void preorderTraversalWithRecursion() {
        var result = BinaryTreePreOrderTraversal.preorderTraversalWithRecursion(createDummyBinarySearchTree());
        Assertions.assertThat(result).containsExactly(5, 3, 2, 4, 8, 6, 9);
    }




    public static TreeNode createDummyBinarySearchTree() {
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