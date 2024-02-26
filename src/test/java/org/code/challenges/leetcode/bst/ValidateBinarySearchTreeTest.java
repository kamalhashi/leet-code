package org.code.challenges.leetcode.bst;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    @Test
    void isValidBST() {
        var result = ValidateBinarySearchTree.isValidBST(createDummyBinarySearchTree());
        Assertions.assertThat(result).isEqualTo(true);

    }

    public static ValidateBinarySearchTree.TreeNode createDummyBinarySearchTree() {
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(5);
        root.left = new ValidateBinarySearchTree.TreeNode(3);
        root.right = new ValidateBinarySearchTree.TreeNode(8);
        root.left.left = new ValidateBinarySearchTree.TreeNode(2);
        root.left.right = new ValidateBinarySearchTree.TreeNode(4);
        root.right.left = new ValidateBinarySearchTree.TreeNode(6);
        root.right.right = new ValidateBinarySearchTree.TreeNode(9);
        return root;
    }
}