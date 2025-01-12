package com.leetcode.topInterview150.twoPointers.twoSumII;

import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int total = nums[left] + nums[right];
            if (total == target) {
                return new int[]{left + 1, right + 1};
            }
            if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
