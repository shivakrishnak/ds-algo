package com.algo.dcp;

//https://backtobackswe.com/platform/content/max-contiguous-subarray-sum/solutions
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(find(arr));
        System.out.println(find1(arr));
    }

    private static int find(int[] arr) {
        int n = arr.length;
        int maxHere = arr[0];
        int maxSumSoFar = arr[0];
        for (int i = 1; i < n; i++) {
            maxHere = Math.max(maxHere + arr[i], arr[i]);
            maxSumSoFar = Math.max(maxHere, maxSumSoFar);
        }
        return maxSumSoFar;
    }

    //O(N)
    private static int find1(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
