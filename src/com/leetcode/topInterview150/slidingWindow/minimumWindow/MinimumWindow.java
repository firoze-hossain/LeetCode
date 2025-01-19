package com.leetcode.topInterview150.slidingWindow.minimumWindow;

public class MinimumWindow {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        int[] x = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        for (char c : t.toCharArray()) {
            x[c]++;
        }
        while (end < s.length()) {
            if (x[s.charAt(end++)]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLen) {
                    minStart = start;
                    minLen = end - start;
                }
                if (x[s.charAt(start++)]++ == 0) {
                    count++;
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minLen + minStart);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s, t));
    }
}
