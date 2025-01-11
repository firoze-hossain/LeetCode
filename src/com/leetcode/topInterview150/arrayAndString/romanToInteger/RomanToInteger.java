package com.leetcode.topInterview150.arrayAndString.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                result -= roman.get(s.charAt(i));
            } else {
                result += roman.get(s.charAt(i));
            }
        }
        return result + roman.get(s.charAt(s.length() - 1));
    }
}
