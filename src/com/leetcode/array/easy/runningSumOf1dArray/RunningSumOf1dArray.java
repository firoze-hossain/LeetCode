package com.leetcode.array.easy.runningSumOf1dArray;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = (ans[i - 1] + nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        //int numbers[] = {1, 2, 3, 4};
        int numbers[] = {1, 1, 1, 1, 1};
        // int numbers[]={3,1,2,10,1};
        int result[] = runningSum(numbers);
        System.out.println(Arrays.toString(result));

    }
}
