package com.leetcode.array.easy.removeDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicate(int[] num) {
        int count = 0;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && num[i] == num[i + 1]) {
                continue;
            }
            num[count] = num[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        //int arr[] = {1, 2, 2, 3, 4, 4, 5};
        int arr[] = {1, 1, 2, 2, 3, 4, 5, 5, 3};
        int result = removeDuplicate(arr);
        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
