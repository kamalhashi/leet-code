package org.code.challenges.leetcode.bst.bsf;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.code.challenges.leetcode.binarysearchtree.BinaryTreeLevelOrderTraversal;
import org.code.challenges.leetcode.binarysearchtree.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrderTraversal() {
        BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();
        var result = traversal.levelOrder(createDummyBinarySearchTree());
        List<List<Integer>> dummy = List.of(List.of(1), List.of(2, 3), List.of(4, 5, 6));
        Assertions.assertThat(result).isEqualTo(dummy);
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