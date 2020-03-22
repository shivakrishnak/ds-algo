package com.shiva.leet;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		ri.reverse(2360);
	}

	public int reverse(int x) {
		int result = 0;

		while (x != 0) {
			int tail = x % 10;
			int newResult = result * 10 + tail;
			// overflow check
			if ((newResult - tail) / 10 != result)
				return 0;
			result = newResult;
			System.out.println(result);
			x = x / 10;
		}
		return result;

	}
}