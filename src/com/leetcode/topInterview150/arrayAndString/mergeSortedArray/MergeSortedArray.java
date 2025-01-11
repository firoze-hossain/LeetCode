package com.leetcode.topInterview150.arrayAndString.mergeSortedArray;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;

        System.out.println("Test Case 1:");
        System.out.println("Before merging: " + Arrays.toString(nums1_1));
        merge(nums1_1, m1, nums2_1, n1);
        System.out.println("After merging:  " + Arrays.toString(nums1_1));
        System.out.println();

        // Test Case 2
        int[] nums1_2 = {1};
        int m2 = 1;
        int[] nums2_2 = {};
        int n2 = 0;

        System.out.println("Test Case 2:");
        System.out.println("Before merging: " + Arrays.toString(nums1_2));
        merge(nums1_2, m2, nums2_2, n2);
        System.out.println("After merging:  " + Arrays.toString(nums1_2));
        System.out.println();

        // Test Case 3
        int[] nums1_3 = {0};
        int m3 = 0;
        int[] nums2_3 = {1};
        int n3 = 1;

        System.out.println("Test Case 3:");
        System.out.println("Before merging: " + Arrays.toString(nums1_3));
        merge(nums1_3, m3, nums2_3, n3);
        System.out.println("After merging:  " + Arrays.toString(nums1_3));
        System.out.println();

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = n;
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[temp - 1];
            while (temp < 0) {
                return;
            }
            temp--;
        }
        Arrays.sort(nums1);
    }
}
