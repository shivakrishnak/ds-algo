package com.algo.leet.array;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] h = {7, 1, 5, 3, 6, 4};
        int[] h1 = {7, 6, 4, 3, 1};
        System.out.println(new BestTimetoBuyandSellStock().maxProfit(h));
    }

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int max = 0;
        while (left < right && right < prices.length) {
            if (prices[left] < prices[right]) {
                int lMax = prices[right] - prices[left];
                max = Math.max(max, lMax);
            } else {
                left = right;
            }
            right++;
        }
        return max;
    }
}