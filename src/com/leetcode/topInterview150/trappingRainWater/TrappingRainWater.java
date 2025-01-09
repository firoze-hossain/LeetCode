package com.leetcode.topInterview150.trappingRainWater;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int ans = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                ans += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                ans += rightMax - height[right];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }
}
