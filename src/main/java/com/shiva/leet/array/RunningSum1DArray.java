package com.shiva.leet.array;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array
public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] result = new RunningSum1DArray().runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(result));

        result = new RunningSum1DArray().runningSum(new int[]{1,1,1,1,1});
        System.out.println(Arrays.toString(result));

        result = new RunningSum1DArray().runningSum(new int[]{3,1,2,10,1});
        System.out.println(Arrays.toString(result));
    }

    public int[] runningSum(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
