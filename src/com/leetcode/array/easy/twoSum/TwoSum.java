package com.leetcode.array.easy.twoSum;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if (nums == null || n < 2) {
            return new int[]{0, 0};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{0, 0};

    }

    public static void main(String[] args) {
        //int nums[] = {2, 7, 11, 15};
        //int nums[]={3,2,4};
        int nums[] = {3, 3};
        //int target = 9;
        //int target=6;
        int target = 6;


        for (int result : twoSum(nums, target)) {
            System.out.print(result + " ");
        }

    }
}
