package com.leetcode.leetCode75.mergeStringsAlternately;

import java.util.Scanner;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(mergeAlternately(s1, s2));
        }
    }

    public static String mergeAlternately(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length()) {
                result.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                result.append(s2.charAt(i));
            }
        }
        return result.toString();
    }
}
