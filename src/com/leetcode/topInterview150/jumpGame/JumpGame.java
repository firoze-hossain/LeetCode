package com.leetcode.topInterview150.jumpGame;

public class JumpGame {
    public static boolean canJump(int nums[]) {
        int maxJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxJump < i)
                return false;
            maxJump = Math.max(maxJump, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
}
