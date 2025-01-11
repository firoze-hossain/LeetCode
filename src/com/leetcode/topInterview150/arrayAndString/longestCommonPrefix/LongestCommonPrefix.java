package com.leetcode.topInterview150.arrayAndString.longestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String first = s[0];
        String last = s[s.length - 1];
        int i = 0;
        while (first.length() > i && last.length() > i) {
            if (first.charAt(i) == last.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return first.substring(0, i);
    }


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
