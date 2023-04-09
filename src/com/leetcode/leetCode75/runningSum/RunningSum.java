package com.leetcode.leetCode75.runningSum;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int sum[] = runningSum(arr);
        System.out.println(Arrays.toString(sum));

    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum[] = new int[n];
        sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        return sum;
    }
}
