package com.leetcode.leetcodebeginners.addtwointegers;

import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Integer num1 = scanner.nextInt();
        System.out.println("Enter the Second number: ");
        Integer num2 = scanner.nextInt();
        AddTwoIntegers addTwoIntegers = new AddTwoIntegers();
        System.out.println("Summation of two numbers= " + addTwoIntegers.addTwoIntegers(num1, num2));
    }

    public Integer addTwoIntegers(Integer num1, Integer num2) {
        return (num1 + num2);
    }
}
