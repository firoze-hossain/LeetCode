package com.leetcode.topInterview150.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int array[] = {1, 4, 4, 1};
        System.out.println(removeDuplicate(array));
    }

    public static int removeDuplicate(int[] nums) {
        int f = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[f] = nums[i];
                f++;
            }
        }
        return f;
    }
}
