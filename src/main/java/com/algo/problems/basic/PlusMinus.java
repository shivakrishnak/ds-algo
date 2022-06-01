package com.algo.problems.basic;

import java.util.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float positive =0, negative =0, zero=0;
        float n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                zero +=1;
            } else if (arr[i] > 0){
                positive +=1;
            } else {
                negative +=1;
            }
        }
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
