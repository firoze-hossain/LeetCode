package com.roze.rotateArray;

import java.util.Arrays;

/*Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
ways do you know to solve this problem?*/
public class Solution1 {
    /*we can create a new array and then copy elements to the
      new array. Then change the original array by using System.arraycopy().*/
    public static void rotate(int nums[], int k) {
        if (k > nums.length) {

            k = k % nums.length;
        }
        int result[] = new int[nums.length];
        for (int i = 0; i < k; i++) {

            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {

            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
