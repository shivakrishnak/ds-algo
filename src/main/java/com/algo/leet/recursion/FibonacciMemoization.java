package com.algo.leet.recursion;

import java.util.HashMap;
import java.util.Map;

//Fibonacci Sequence = 0,1,1,2,3,5,8,13..
public class FibonacciMemoization {
	public static void main(String[] args) {
		FibonacciMemoization fb = new FibonacciMemoization();
		System.out.println(fb.fib(10));
	}

	public int fib(int N) {
		int result;
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		if (cache.containsKey(N)) {
			return cache.get(N);
		}
		if (N < 2) {
			result = N;
		} else {
			result = fib(N - 1) + fib(N - 2);
		}
		cache.put(N, result);
		return result;
	}
}