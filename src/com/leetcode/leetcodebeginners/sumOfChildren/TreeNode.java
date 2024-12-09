package com.leetcode.leetcodebeginners.sumOfChildren;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public boolean check(TreeNode root){
        if(root.left.val+root.right.val==root.val){
            return true;
        }
        return false;
    }


}
