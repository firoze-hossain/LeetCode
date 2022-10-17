package com.leetcode.array.easy.fibonacciNumber;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fib(int n) {
        int x = 0, y = 1, z = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
