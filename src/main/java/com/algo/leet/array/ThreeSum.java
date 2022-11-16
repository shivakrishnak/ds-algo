package com.algo.leet.array;

import java.util.*;

class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = new ThreeSum().threeSum(nums);
        res.stream().forEach(System.out::println);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE, left = 0, right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            if (target > 0) break;
            left = i + 1;
            right = nums.length - 1;
            if (prev != target) { // avoid duplicates
                while (left < right) {
                    int threeSum = nums[left] + nums[right] + target;
                    if (threeSum == 0) {
                        res.add(List.of(target, nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (threeSum > 0) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
            prev = target;
        }
        return new ArrayList<>(res);
    }
}