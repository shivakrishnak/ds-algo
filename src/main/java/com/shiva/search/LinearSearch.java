package com.shiva.search;

public class LinearSearch {
	 public static void main(String[] args) {
	        int[] arr = {1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99};
	        int n = 79;
	        int index = search(arr, n);
	        System.out.println("Found key at index " + index);
	    }

	private static int search(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if( n == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
