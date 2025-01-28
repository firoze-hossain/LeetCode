package com.leetcode.topInterview150.hashmap.validAnagram;

import java.util.Arrays;

public class ValidAnagram {
    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length()) {
    // return false;
    // }
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (char c : s.toCharArray()) {
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // }
    // for (char c : t.toCharArray()) {
    // if (!map.containsKey(c)) {
    // return false;
    // }
    // map.put(c, map.get(c) - 1);
    // if (map.get(c) == 0) {
    // map.remove(c);
    // }

    // }
    // return map.isEmpty();
    // }
    public static boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        return Arrays.equals(cs, ts);
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
