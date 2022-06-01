package com.algo.problems.search;

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

    public static class BinarySearch {
        public static void main(String[] args) {
            int key = 35;
            int[] arr = {2, 4, 6, 8, 9, 12, 24, 36, 45, 68, 79, 89};
            System.out.println(search(arr, key));
            System.out.println(recursion(arr, key));

        }

        private static int recursion(int[] arr, int key) {
            int n = arr.length;
            int l = 0, r = n - 1;
            return recurse(arr, l, r, key);
        }

        private static int recurse(int[] arr, int l, int r, int key) {
            if (l < r) {
                int mid = (l + r) / 2;
                if (arr[mid] == key) {
                    return mid;
                } else if (key > arr[mid]) {
                    l = mid + 1;
                    return recurse(arr, l, r, key);
                } else {
                    r = mid - 1;
                    return recurse(arr, l, r, key);
                }
            }
            return -1;
        }

        private static int search(int[] arr, int key) {
            int n = arr.length;
            int l = 0, r = n - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (arr[mid] == key) {
                    return mid;
                } else if (key > arr[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            return -1;
        }
    }

    public static class LinearSearch {
        public static void main(String[] args) {
            int k = 8;
            int[] arr = {1, 2, 4, 6, 8, 9};
            System.out.println(search(arr, k));
            System.out.println(recursion(arr, k));
        }

        private static int search(int[] arr, int k) {
            if (arr.length == 0) return -1;
            for (int i = 0; i < arr.length; i++) {
                if (k == arr[i]) {
                    return i;
                }
            }
            return -1;
        }

        private static int recursion(int[] arr, int k) {
            int l = 0;
            int r = arr.length - 1;
            return recurse(arr, l, r, k);
        }

        private static int recurse(int[] arr, int l, int r, int k) {
            if (l > r) return -1;
            if (arr[l] == k) return l;
            if (arr[r] == k) return r;
            return recurse(arr, l + 1, r - 1, k);
        }

    }
}
