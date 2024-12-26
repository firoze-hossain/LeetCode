package com.leetcode.topInterview150.rotateArray;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotatedArray = new int[n];
        k = k % n;
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = rotatedArray[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
