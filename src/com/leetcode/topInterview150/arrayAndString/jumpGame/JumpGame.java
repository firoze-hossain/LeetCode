package com.leetcode.topInterview150.arrayAndString.jumpGame;

public class JumpGame {
    public static boolean canJump(int nums[]) {
        int maxJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (maxJump < i)
                return false;
            maxJump = Math.max(maxJump, i + nums[i]);
            if (maxJump >= nums.length - 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }
}
