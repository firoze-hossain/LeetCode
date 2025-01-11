package com.leetcode.topInterview150.arrayAndString.gasStation;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) {
            return -1;
        }
        int m = 0;
        int count = 0;
        for (int i = 0; i < gas.length; i++) {
            m += gas[i] - cost[i];
            if (m < 0) {
                m = 0;
                count = i + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int cost[] = {3, 4, 5, 1, 2};
        System.out.println(canCompleteCircuit(gas, cost));
    }
}
