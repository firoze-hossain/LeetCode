package com.leetcode.leetcodebeginners.richestCustomerWealth;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of customers: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of account per customer: ");
        int n = sc.nextInt();
        int accounts[][] = new int[m][n];
        System.out.println("Enter the wealth values for each customer's accounts: ");
        for (int i = 0; i < m; i++) {
            System.out.println("Customer " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
            }

        }
        RichestCustomerWealth richestCustomerWealth = new RichestCustomerWealth();
        int maxAmount = richestCustomerWealth.maxAmount(accounts);
        System.out.println("The maximum wealth among all customers is:  " + maxAmount);

    }

    public int maxAmount(int[][] accounts) {
        int result = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            result = Math.max(temp, result);
        }
        return result;
    }
}
