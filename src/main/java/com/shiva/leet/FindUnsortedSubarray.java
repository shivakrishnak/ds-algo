package com.shiva.leet;

import java.util.Arrays;

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
class FindUnsortedSubarray {
    public static void main(String[] args) {
        FindUnsortedSubarray f = new FindUnsortedSubarray();
        int[] input = {2, 6, 4, 8, 10, 9, 15};
System.out.println(f.findUnsortedSubarray(input));
    }

    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int start = 0, end = length - 1;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        Arrays.stream(sortedNums).forEach(System.out::println);
        while (start < length && nums[start] == sortedNums[start]) {
            start++;
        }
        while (end > 0 && nums[end] == sortedNums[end]) {
            end--;
        }
        if (start == length && end == 0){
            return 0;
        }
        return end - start + 1;
    }
}