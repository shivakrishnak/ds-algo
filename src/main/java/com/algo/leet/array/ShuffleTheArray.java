package com.algo.leet.array;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {2, 5, 1, 3, 4, 7};
        int[] result = new ShuffleTheArray().shuffle(arr, n);
        System.out.println(Arrays.toString(result));

        result = new ShuffleTheArray().shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);
        System.out.println(Arrays.toString(result));

        result = new ShuffleTheArray().shuffle(new int[]{1, 1, 2, 2}, 2);
        System.out.println(Arrays.toString(result));

    }

    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] result = new int[nums.length];
        int j = len / 2;
        for (int i = 0; i < len / 2; i++) {
            int k = 2 * i;
            result[k] = nums[i];
            result[k + 1] = nums[j];
            j++;
        }
        return result;
    }
}
