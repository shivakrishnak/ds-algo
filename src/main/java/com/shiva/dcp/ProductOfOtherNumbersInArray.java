package com.shiva.dcp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProductOfOtherNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(find(arr)));
    }

    private static int[] find(int[] arr) {
        int[] finalArray = new int[arr.length];
        int[] preProdArr = new int[arr.length];
        int[] postProdArr = new int[arr.length];
        int preProd = 1, postProd = 1;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            preProdArr[i] = preProd;
            preProd *= arr[i];

            postProdArr[j] = postProd;
            postProd *= arr[j];
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            finalArray[i] = preProdArr[i] * postProdArr[i];
        }
        System.out.println(Arrays.toString(preProdArr));
        System.out.println(Arrays.toString(postProdArr));
        return finalArray;
    }

    private static int[] find1(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j){
                    prod *= arr[j];
                }
            }
            res[i] = prod;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
