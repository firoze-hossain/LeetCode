package com.leetcode.topInterview150.hashmap.happyNumber;

import java.util.HashMap;

public class HappyNumber {
    // public static boolean isHappy(int n) {
    // if (n == 7 || n == 1) {
    // return true;
    // } else if (n < 10) {
    // return false;
    // } else {
    // int sum = 0;
    // while (n > 0) {
    // int temp = n % 10;
    // sum += temp * temp;
    // n /= 10;
    // }
    // return isHappy(sum);
    // }
    // }
    public static boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n != 1) {
            if (map.containsKey(n)) {
                return false;
            }
            map.put(n, 1);
            n = getNext(n);
        }
        return true;
    }

    public static int getNext(int num) {
        int sum = 0;
        while (num > 0) {
            int temp = num % 10;
            sum += temp * temp;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
