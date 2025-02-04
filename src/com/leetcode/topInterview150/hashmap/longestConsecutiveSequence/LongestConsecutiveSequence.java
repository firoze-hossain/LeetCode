package com.leetcode.topInterview150.hashmap.longestConsecutiveSequence;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                int leftLen = map.getOrDefault(num - 1, 0);
                int rightLen = map.getOrDefault(num + 1, 0);
                int newLength = leftLen + rightLen + 1;
                map.put(num, newLength);
                map.put(num - leftLen, newLength);
                map.put(num + rightLen, newLength);
                max = Math.max(newLength, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
}
