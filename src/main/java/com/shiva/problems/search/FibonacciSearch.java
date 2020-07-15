package com.shiva.problems.search;

import java.util.Arrays;

public class FibonacciSearch {
	 public static void main(String[] args) {
	        int[] arr = {1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99};
	        int n = 79;
	        int index = search(arr, n);
	        System.out.println("Found key at index " + index);
	    }

	private static int search(int[] arr, int key) {
		int left = 0;
		int size = arr.length;
		if(arr[left] == key) return left;
		int fb1 = 0;
		int fb2 = 1;
		int fib = fb1 + fb2;
		while(fib < size && arr[fib] <= key) {
			fb1 = fb2;
			fb2 = fib;
			fib = fb1 + fb2;
		}
		return Arrays.binarySearch(arr,  fb2, Math.min(fib, size), key);
	}
}
