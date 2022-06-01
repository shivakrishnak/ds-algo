package com.algo.dcp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int[] arr2 = {1, 2, 0};
        System.out.println(find(arr2));
    }

    private static int find(int[] arr) {
        if (arr.length == 0) {
            return 1;
        }
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0 && arr[i] <= arr.length && arr[arr[i] - 1] != arr[i]) {
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        i = 0;
        while (i < arr.length && arr[i] == i + 1) {
            i++;
        }

        System.out.println(Arrays.toString(arr));
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int find1(int[] arr) {
        Set set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                set.add(arr[i]);
            }
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        System.out.println(set);
        return 1;
    }
}
