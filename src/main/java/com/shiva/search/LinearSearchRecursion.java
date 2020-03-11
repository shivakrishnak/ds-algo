package com.shiva.search;

public class LinearSearchRecursion {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99 };
		int key = 79;
		int size = arr.length;
		int l = 0;
		int r = size -1;
		int index = search(arr, l, r , key);
		System.out.println("Found key at index " + index);
	}

	private static int search(int[] arr, int l, int r, int key) {
		if(r < l) return -1;
		if(arr[l] == key) return l;
		if(arr[r] == key) return r;
		return search(arr, l + 1, r - 1, key);
	}
}
