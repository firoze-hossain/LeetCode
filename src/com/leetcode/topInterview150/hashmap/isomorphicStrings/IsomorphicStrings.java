package com.leetcode.topInterview150.hashmap.isomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), i);
            }
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), i);
            }
            if (!map1.get(s.charAt(i)).equals(map2.get(t.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));


    }
}
