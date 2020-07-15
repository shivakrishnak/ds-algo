package com.shiva.problems.search;

import java.util.Arrays;

public class ExponentialSearch {
	 public static void main(String[] args) {
	        int[] arr = {1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99};
	        int n = 65;
	        int index = search(arr, n);
	        System.out.println("Found key at index " + index);
	    }

	private static int search(int[] arr, int key) {
		int left = 0;
		int size = arr.length;
		if(arr[left] == key) return left;
		int exp = 1;
		while(exp < size && arr[exp] <= key) {
			exp = exp * 2;
		}
		return Arrays.binarySearch(arr,  exp/2, Math.min(exp, size), key);
	}
}
