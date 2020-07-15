package com.shiva.problems.search;

public class InterpolationSearch {
	 public static void main(String[] args) {
	        int[] arr = {1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99};
	        int n = 5;
	        int index = search(arr, n);
	        System.out.println("Found key at index " + index);
	    }
	 //Interpolation pos = lo + [(x - arr[lo]) * (hi -lo) / (arr[hi] - arr[lo])
	private static int search(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high && key >= arr[low]) {
			if(low == high) {
				if(arr[low] == key ) return low;
				return -1;
			}
			int pos = low + ((high - low) / (arr[high] - arr[low]) * (key - arr[low]));
			
			if(arr[pos] == key) {
				return pos;
			}
			if(arr[pos] < key) {
				low = pos + 1;
			} else {
				high = pos - 1;
			}
		}
		return -1;
	}
}
