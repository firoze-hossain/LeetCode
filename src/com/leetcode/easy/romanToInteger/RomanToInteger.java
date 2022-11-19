package com.leetcode.easy.romanToInteger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] sChar = s.toCharArray();
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((hm.get(sChar[i + 1]) <= hm.get(sChar[i]))) {
                sum = sum + hm.get(sChar[i]);
            } else {
                sum = sum - hm.get(sChar[i]);
            }
        }

        return sum + hm.get(sChar[s.length() - 1]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Roman Number: ");
        String st=sc.nextLine();
        System.out.println(romanToInt(st));

    }
}
