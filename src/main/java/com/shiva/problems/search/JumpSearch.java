package com.shiva.problems.search;

public class JumpSearch {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99 };
		int key = 65;
		int size = arr.length;
		int index = search(arr, size, key);
		System.out.println("Found key at index " + index);
	}

	private static int search(int[] arr, int size, int key) {
		int step = (int) Math.floor(Math.sqrt(size));
		int prev = 0;
		// Finding the Block
		while (arr[Math.min(step, size) - 1] < key) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(size));
			if (prev >= size) {
				return -1;
			}
		}
		while (prev < step) {
			if (arr[prev] == key) {
				return prev;
			}
			prev++;
		}
		return -1;
	}
}
