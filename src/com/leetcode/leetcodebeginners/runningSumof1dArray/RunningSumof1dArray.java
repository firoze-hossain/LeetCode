package com.leetcode.leetcodebeginners.runningSumof1dArray;

import java.util.Scanner;

public class RunningSumof1dArray {
    public int[] sumOfNums(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        n = sc.nextInt();
        int[] arrayNums = new int[n];
        System.out.println("Enter the array numbers: ");
        for (int i = 0; i < n; i++) {
            arrayNums[i] = sc.nextInt();
        }
        RunningSumof1dArray runningSumof1dArray = new RunningSumof1dArray();
        int[] result = runningSumof1dArray.sumOfNums(arrayNums);
        for (int num : result) {
            System.out.print(num + " ");
        }

    }
}
