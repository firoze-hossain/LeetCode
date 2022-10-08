package com.leetcode.array.easy.pivotIndex;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0, leftSum = 0;
        for (int k : nums) {
            total = total + k;
        }
        for (int i = 0; i < n; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        //int nums[] = {1, 7, 3, 6, 5, 6};
        //int nums[]={1,2,3};
        int nums[] = {2, 1, -1};
        int result = pivotIndex(nums);
        System.out.println(result);
    }
}
