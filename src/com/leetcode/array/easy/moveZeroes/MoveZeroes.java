package com.leetcode.array.easy.moveZeroes;

public class MoveZeroes {
    public static void moveZeroes(int[] num) {
        int count = 0;
        int len = num.length;
        for (int i = 0; i < len; i++) {
            if (num[i] != 0) {
                num[count++] = num[i];
            }
        }
        for (int i = count; i < len; i++) {
            num[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        //int arr[]={0};
        int length = arr.length;
        moveZeroes(arr);
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
