package com.shiva.search;

public class LinearSearch {
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
