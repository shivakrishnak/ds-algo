package com.shiva.search;


public class BinarySearch {
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
