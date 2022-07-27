package com.roze.rotateArray;

import java.util.Arrays;

/*Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
ways do you know to solve this problem?*/
public class BubbleSorting {
    //Bubble Rotate
    public static void rotate(int[] arr, int order) {

        for (int i = 0; i < order; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
