package com.leetcode.topInterview150.jumpGameII;

public class JumpGameII {
    public static int jump(int[] nums) {
        int jump = 0, currentEnd = 0, currentFar = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentFar = Math.max(currentFar, i + nums[i]);
            if (i == currentEnd) {
                currentEnd = currentFar;
                jump++;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(jump(nums));
    }
}
