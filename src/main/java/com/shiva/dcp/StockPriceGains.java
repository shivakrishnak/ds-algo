package com.shiva.dcp;

public class StockPriceGains {

    public static void main(String[] args) {
        int[] stockPrices = new int[]{10, 7, 5, 8, 11, 9};

        System.out.println(getMaxProfit(stockPrices));
    }

    public static int getMaxProfit(int[] stockPrices) {

        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        // we'll greedily update minPrice and maxProfit, so we initialize
        // them to the first price and the first possible profit
        int minPrice = stockPrices[0];
        int maxProfit = stockPrices[1] - stockPrices[0];

        // start at the second (index 1) time
        // we can't sell at the first time, since we must buy first,
        // and we can't buy and sell at the same time!
        // if we started at index 0, we'd try to buy *and* sell at time 0.
        // this would give a profit of 0, which is a problem if our
        // maxProfit is supposed to be *negative*--we'd return 0.
        for (int i = 1; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];

            // see what our profit would be if we bought at the
            // min price and sold at the current price
            int potentialProfit = currentPrice - minPrice;

            // update maxProfit if we can do better
            maxProfit = Math.max(maxProfit, potentialProfit);

            // update minPrice so it's always
            // the lowest price we've seen so far
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }

    private static int getMaxProfit2(int[] stockPrices) {
        int maxProfit = 0;
        int minPrice = stockPrices[0];
        for (int currentPrice : stockPrices) {
            minPrice = Math.min(minPrice, currentPrice);
            int profit = currentPrice - minPrice;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }

    private static int getMaxProfit1(int[] stockPrices) {
        int max = 0;
        for (int i = 0; i < stockPrices.length; i++) {
            for (int j = i + 1; j < stockPrices.length; j++) {
                int diff = stockPrices[j] - stockPrices[i];
/*                if(diff > max){
                    max = diff;
                }*/
                max = Math.max(diff, max);
            }

        }
        return max;
    }

}
