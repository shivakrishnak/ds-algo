package com.shiva.dcp;

import java.util.HashSet;
import java.util.Set;

public class KSumInArray {
    public static void main(String[] args) {
        int k = 17;
        int[] arr = {10,15,3,7};
        System.out.println(find(arr, k));
    }

    private static boolean find(int[] arr, int k) {
        Set backup = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            if (backup.contains(k - arr[i])){
                System.out.println(i + " -- " + backup);
                return true;
            }
            backup.add(arr[i]);
        }
        return false;
    }

    private static boolean find1(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i !=j && arr[i] + arr[j] == 17){
                    System.out.println(i + " -- " + j);
                    return true;
                }
            }
        }
        return false;
    }
}
