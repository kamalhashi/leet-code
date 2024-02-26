package org.code.challenges.leetcode.binarytree;


import org.assertj.core.api.Assertions;
import org.code.challenges.leetcode.binarytree.ValidBinaryTree.TreeNode;
import org.junit.jupiter.api.Test;

class ValidBinaryTreeTest {

    @Test
    void isValidBSTDFS() {
        TreeNode root = new TreeNode();

        TreeNode leftNode = new TreeNode();

        TreeNode rightNode = new TreeNode();


        TreeNode leftNodeLevel2 = new TreeNode();
        leftNodeLevel2.setVal(4);

        TreeNode leftNodeLevel3 = new TreeNode();
        leftNodeLevel3.setVal(3);



        root.setVal(6);
        leftNode.setVal(5);
        rightNode.setVal(7);


        root.setLeft(leftNode);
        root.setRight(rightNode);

        leftNode.setLeft(leftNodeLevel2);
        leftNodeLevel2.setLeft(leftNodeLevel3);

        ValidBinaryTree validBinaryTree = new ValidBinaryTree();
        var result= validBinaryTree.isValidBSTDFS(root);
        Assertions.assertThat(result).isEqualTo(true);

    }
}