package com.leetcode.array.easy.majorityElement;

public class MajorityElement {
    public static void main(String[] args) {
        //int nums[] = {3, 2, 3};
        // int nums[] = {2, 2, 1, 1, 1, 2, 2};
        //int nums[] = {6,5,5};
        int nums[] = {3, 3, 4};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int n = nums.length;
        int candidate = -1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = nums[i];
                count += (candidate == nums[i]) ? 1 : -1;

            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;

    }
}
