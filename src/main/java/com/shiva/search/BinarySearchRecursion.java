package com.shiva.search;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99};
        int key = 79;
        int left = 0;
        int right = arr.length - 1;
        int index = binarySearch(arr, left, right,  key);
        System.out.println("Found key at index " + index);
    }

    //if n > mid - l = mid and high = max
    //if n< mid - l = 0  and high = mid
    private static int binarySearch(int[] arr, int left, int right, int key) {
    	if(left <= right) {
    		int mid = (left + right) / 2;
    		System.out.println("mid " + mid );
    		if (arr[mid] == key) {
				return mid;
			} 
    		if (arr[mid] > key) {
				System.out.println("left " + mid );
				return binarySearch(arr, left, mid - 1, key);
			} 
		
			System.out.println("right " + mid );
			return binarySearch(arr, mid + 1, right, key);
    	}
    	return -1;
    }
}
