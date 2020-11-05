package com.shiva.dcp;

import java.util.HashSet;
import java.util.Set;

public class MissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int[] arr2 = {1, 2, 0};
        System.out.println(find(arr2));
    }

    private static int find(int[] arr) {
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
        return 0;
    }
}
