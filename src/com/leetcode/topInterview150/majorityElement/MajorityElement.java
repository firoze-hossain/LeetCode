package com.leetcode.topInterview150.majorityElement;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int n = 0;
        for (int num : nums) {
            if (count == 0) {
                n = num;
            }
            if (n == num) {
                count++;
            } else {
                count--;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }
}
