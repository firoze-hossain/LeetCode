package com.leetcode.array.easy.searchInsertPosition;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arrs[] = {1, 2, 3, 5};
        int target = 6;
        System.out.println(searchInsert(arrs, target));
    }

    public static int searchInsert(int nums[], int target) {
        int first = 0;
        int last = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int mid = (first + last) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return last + 1;

    }
}
