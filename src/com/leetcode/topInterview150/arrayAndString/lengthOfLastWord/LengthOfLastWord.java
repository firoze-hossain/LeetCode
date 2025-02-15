package com.leetcode.topInterview150.arrayAndString.lengthOfLastWord;

public class LengthOfLastWord{
 public int lengthOfLastWord(String s) {
        s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    break;
                }
            }
        }
        return count;
    }
}
