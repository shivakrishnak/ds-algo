package com.shiva.leet;

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
class FindUnsortedSubarray {
    public static void main(String[] args) {
        FindUnsortedSubarray f = new FindUnsortedSubarray();
        int[] input = {2, 6, 4, 8, 10, 9, 15};
        f.findUnsortedSubarray(input);
    }
    public int findUnsortedSubarray(int[] nums) {
        int startIndex, endIndex;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i + 1] < 0){

            }
        }
        return 0;
    }
}