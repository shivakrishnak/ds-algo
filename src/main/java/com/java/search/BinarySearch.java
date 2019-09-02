package com.java.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 10, 33, 45, 65, 75, 79, 80, 94, 99};
        int n = 79;
        int index = binarySearch(arr, n);
        System.out.println("Found key at index " + index);
    }

    //if n > mid - l = mid and high = max
    //if n< mid - l = 0  and high = mid
    private static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            System.out.println("low " + low);
            System.out.println("high " + high);
            int mid =  (high + low) / 2;
            System.out.println("mid " + mid);
            if (key < arr[mid]) {
                high = mid - 1;
                System.out.println("highhhhhh ");
            } else if (key > arr[mid]) {
                low = mid + 1;
                System.out.println("loowwww ");
            } else {
                return mid;
            }
        }
        return -1;
    }
}
