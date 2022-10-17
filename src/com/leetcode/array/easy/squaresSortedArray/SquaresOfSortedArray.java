package com.leetcode.array.easy.squaresSortedArray;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        //int nums[] = {-4, -1, 0, 3, 10};
        int nums[] = {-7, -3, 2, 3, 11};
        int n = nums.length;
        sortedSquares(nums);
        System.out.println("Sorted Squares: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[start]) > nums[end]) {
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }

        }
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
        return result;
    }
}
