package com.leetcode.topInterview150.removeDuplicatesFromSortedArrayII;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] array = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(array));
        System.out.println(Arrays.toString(Arrays.copyOf(array, removeDuplicates(array))));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
