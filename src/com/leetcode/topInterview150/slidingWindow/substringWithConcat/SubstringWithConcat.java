package com.leetcode.topInterview150.slidingWindow.substringWithConcat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcat {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = words.length;
        int w = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        for (String x : words) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < w; i++) {
            Map<String, Integer> temp = new HashMap<>();
            int count = 0;
            for (int j = i, k = i; j + w <= n; j = j + w) {
                String word = s.substring(j, j + w);
                temp.put(word, temp.getOrDefault(word, 0) + 1);
                count++;
                if (count == m) {
                    if (map.equals(temp)) {
                        ans.add(k);
                    }
                    String remove = s.substring(k, k + w);
                    temp.computeIfPresent(remove, (a, b) -> (b > 1) ? b - 1 : null);
                    count--;
                    k = k + w;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        System.out.println(findSubstring(s, words));
    }
}
