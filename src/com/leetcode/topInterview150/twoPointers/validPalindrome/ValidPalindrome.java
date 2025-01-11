package com.leetcode.topInterview150.twoPointers.validPalindrome;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String first = sb.toString();
        String last = sb.reverse().toString();
        return first.equals(last);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
