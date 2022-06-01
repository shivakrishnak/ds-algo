package com.algo.dcp;

import java.util.Arrays;

public class NonAdjacentLargestSum {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 1, 5};
        System.out.println(find(arr));
        System.out.println(check(arr));
    }

    private static int find(int[] arr) {
        int[] dp = {arr[0], arr[1]};
        System.out.println(Arrays.toString(dp));
        for (int i = 2; i < arr.length; i++) {
            int temp = dp[1];
            dp[1] = dp[0] + arr[i];
            dp[0] = Math.max(dp[0], temp);

        }
        return Math.max(dp[0], dp[1]);
    }

    private static int check(int[] arr) {
        int excl = 0;
        int incl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = Math.max(excl + arr[i], incl);
            excl = temp;
        }
        return incl;
    }
}
