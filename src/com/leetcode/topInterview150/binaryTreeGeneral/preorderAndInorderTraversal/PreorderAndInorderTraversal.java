package com.leetcode.topInterview150.binaryTreeGeneral.preorderAndInorderTraversal;

public class PreorderAndInorderTraversal {
    int p;
    int i;

    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        return build(preOrder, inOrder, Integer.MIN_VALUE);
    }

    private TreeNode build(int[] preOrder, int[] inOrder, int stop) {
        if (p >= preOrder.length) {
            return null;
        }
        if (inOrder[i] == stop) {
            ++i;
            return null;
        }
        TreeNode node = new TreeNode(preOrder[p++]);
        node.left = build(preOrder, inOrder, node.val);
        node.right = build(preOrder, inOrder, stop);
        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
