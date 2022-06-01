package com.algo.leet;

//https://leetcode.com/problems/non-decreasing-array/
public class NonDecreasingArray {
	public static void main(String[] args) {
		NonDecreasingArray nd = new NonDecreasingArray();
		System.out.println(nd.checkPossibility(new int[] { 1, 5, 2, 4, 3 }));
	}

	public boolean checkPossibility(int[] nums) {
		int count = 0;
		int prev = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (prev > nums[i]) {
				if (count++ > 0)
					return false;
				if (i - 2 >= 0 && nums[i - 2] > nums[i])
					continue;
			}
			prev = nums[i];
		}
		return true;
	}

}