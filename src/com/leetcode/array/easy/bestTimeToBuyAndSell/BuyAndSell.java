package com.leetcode.array.easy.bestTimeToBuyAndSell;

public class BuyAndSell {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }
        }

        return maxProfit;
    }

    public static void main(String[] ags) {
        int prices[] = {7, 1, 5, 3, 6, 4};
       // int prices[] = {7, 6, 4, 3, 1};
        int n = prices.length;
        int result = maxProfit(prices);
        System.out.println(result);
    }
}
