package com.leetcode.leetcodebeginners.ransomNote;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char c = ransomNote.charAt(j);
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote ransomNoteChecker = new RansomNote();

        // Test case 1: Can construct ransom note
        String ransomNote1 = "aa";
        String magazine1 = "aab";
        boolean result1 = ransomNoteChecker.canConstruct(ransomNote1, magazine1);
        System.out.println("Test Case 1: " + result1); // Expected: true

        // Test case 2: Cannot construct ransom note
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        boolean result2 = ransomNoteChecker.canConstruct(ransomNote2, magazine2);
        System.out.println("Test Case 2: " + result2); // Expected: false

        // Test case 3: Ransom note is empty
        String ransomNote3 = "";
        String magazine3 = "anything";
        boolean result3 = ransomNoteChecker.canConstruct(ransomNote3, magazine3);
        System.out.println("Test Case 3: " + result3); // Expected: true

        // Test case 4: Magazine is empty but ransom note is not
        String ransomNote4 = "abc";
        String magazine4 = "";
        boolean result4 = ransomNoteChecker.canConstruct(ransomNote4, magazine4);
        System.out.println("Test Case 4: " + result4); // Expected: false

        // Test case 5: Both ransom note and magazine are empty
        String ransomNote5 = "";
        String magazine5 = "";
        boolean result5 = ransomNoteChecker.canConstruct(ransomNote5, magazine5);
        System.out.println("Test Case 5: " + result5); // Expected: true

        // Test case 6: Long ransom note
        String ransomNote6 = "leetcode";
        String magazine6 = "letcodexcodeee";
        boolean result6 = ransomNoteChecker.canConstruct(ransomNote6, magazine6);
        System.out.println("Test Case 6: " + result6); // Expected: true
    }
}
