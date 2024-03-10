package org.code.challenges.leetcode.bst;

import org.assertj.core.api.Assertions;
import org.code.challenges.leetcode.binarysearchtree.TreeNode;
import org.code.challenges.leetcode.binarysearchtree.ValidateBinarySearchTree;
import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

    @Test
    void isValidBST() {
        var result = ValidateBinarySearchTree.isValidBST(createDummyBinarySearchTree());
        Assertions.assertThat(result).isEqualTo(true);

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