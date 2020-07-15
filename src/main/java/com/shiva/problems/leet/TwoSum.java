package com.shiva.problems.leet;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
	public static void main(String[] args) {
		TwoSum ts = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		int[] res = ts.twoSum3(nums, 13);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}

	}

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[0];
	}

	public int[] twoSum2(int[] nums, int target) {
		Map<Integer, Integer> numbers = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			numbers.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (numbers.containsKey(comp) && numbers.get(comp) != i) {
				return new int[] {i,numbers.get(comp)};
			}
		}
		return new int[0];
	}
	
	public int[] twoSum3(int[] nums, int target) {
		Map<Integer, Integer> numbers = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (numbers.containsKey(comp) && numbers.get(comp) != i) {
				return new int[] {numbers.get(comp) , i};
			}
			numbers.put(nums[i], i);
		}
		return new int[0];
	}
}
