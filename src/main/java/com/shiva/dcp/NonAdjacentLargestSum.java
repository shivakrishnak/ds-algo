package com.shiva.dcp;

import java.util.Arrays;

public class NonAdjacentLargestSum {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 1, 5};
        System.out.println(find(arr));
    }

    private static int find(int[] arr) {
        int[] dp = {arr[0], arr[1]};
        System.out.println(Arrays.toString(dp));
        for (int i = 2; i < arr.length; i++) {
            int temp = dp[1];
            dp[1] = dp[0] + arr[i];
            dp[0] = Math.max(dp[0], temp);

        }
        return Math.max(dp[0],dp[1]);
    }
}
