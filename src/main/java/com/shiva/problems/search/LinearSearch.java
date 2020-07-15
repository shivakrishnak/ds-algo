package com.shiva.problems.search;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99 };
		int key = 79;
		int size = arr.length;
		int index = search(arr, size, key);
		System.out.println("Found key at index " + index);
	}

	private static int search(int[] arr, int size, int key) {
		for (int i = 0; i < size; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
