package com.leetcode.topInterview150.arrayAndString.integerToRoman;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                sb.append(s[i]);
                num -= nums[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }
}
