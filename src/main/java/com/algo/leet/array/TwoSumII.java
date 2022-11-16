package com.algo.leet.array;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] res = new TwoSumII().twoSum(nums, 9);
        System.out.println(res[0] + ":" + res[1]);
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length -1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{numbers[left], numbers[right]};
            }
        }
        return new int[0];
    }
}