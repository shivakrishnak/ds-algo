package com.shiva.leet.recursion;

//Fibonacci Sequence = 1,1,2,3,5,8,13..
public class ClimbingStairsMemoization {
	public static void main(String[] args) {
		ClimbingStairsMemoization fb = new ClimbingStairsMemoization();
		System.out.println(fb.climbStairs(9));
	}

	public int climbStairs(int n) {
		if (n < 2) return 1;
		int one = 1;
		int two = 1;
		int total = 0;
		for (int i = 2; i <= n; i++) {
			total = one + two;
			one = two;
			two = total;
		}
		return total;
	}
}