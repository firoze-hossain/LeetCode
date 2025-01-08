package com.leetcode.topInterview150.candy;

public class Candy {
    public static int candy(int ratings[]) {
        int n = ratings.length;
        int[] candy = new int[n];
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }
        int ans = 0;
        for (int i : candy) {
            ans += i + 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] ratings = {1, 0, 2};
        System.out.println(candy(ratings));
    }
}
