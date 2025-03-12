package com.leetcode.topInterview150.binaryTreeGeneral.treeFromInorderAndPostorderTraversal;

public class TreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inOrder, int[] postOrder) {
        return buildTree(inOrder, 0, inOrder.length - 1, postOrder, 0, postOrder.length - 1);
    }

    private TreeNode buildTree(int[] inOrder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }
        int rootVal = postOrder[postEnd];
        TreeNode root = new TreeNode(rootVal);
        int rootIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inOrder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;
        root.left = buildTree(inOrder, inStart, rootIndex - 1, postOrder, postStart, postStart + leftSize - 1);
        root.right = buildTree(inOrder, rootIndex + 1, inEnd, postOrder, postEnd - rightSize, postEnd - 1);
        return root;
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