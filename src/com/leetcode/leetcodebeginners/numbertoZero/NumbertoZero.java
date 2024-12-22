package com.leetcode.leetcodebeginners.numbertoZero;

import java.util.Scanner;

public class NumbertoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        NumbertoZero numbertoZero = new NumbertoZero();
        int steps = numbertoZero.numOfSteps(n);
        System.out.println("Total steps: " + steps);
        sc.close();
    }

    public int numOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num -= 1;
                count++;
            }
        }
        return count;
    }
}
