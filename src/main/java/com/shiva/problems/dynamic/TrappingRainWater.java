package com.shiva.problems.dynamic;

import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        /*int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int maxSum = findWater(arr, arr.length);
        System.out.println("Trapping Rain Water Sum : " + maxSum);*/

        Scanner scan = new Scanner(System.in);
        int noTest = scan.nextInt(); //Test Cases
        for (int i = 0; i < noTest; i++) {
            int noInputs = scan.nextInt(); //T1 ... Tn
            int[] inputArr = new int[noInputs];
            for (int j = 0; j < noInputs; j++) {
                inputArr[j] = scan.nextInt();
            }
            int sum = findWater(inputArr, inputArr.length);
            System.out.println(sum);
        }
    }

    private static int findWater(int[] arr, int len) {
        int[] leftSum = new int[len];
        int[] rightSum = new int[len];
        int maxWater = 0;

        //Find Max height from left to right
        leftSum[0] = arr[0];
        for (int i = 1; i < len; i++) {
            leftSum[i] = Math.max(arr[i] , leftSum[i -1]);
            //System.out.println("left " + leftSum[i]);
        }

        //Find Max height from right to left
        rightSum[len - 1] = arr[len - 1];
        for (int j = len - 2 ; j > 0; j--) {
            rightSum[j] = Math.max(arr[j] , rightSum[j + 1]);
            //System.out.println("rightSum " + rightSum[j]);
        }
        //Find the max water trapped - Max(left,right) - arrayValue
        for (int k = 0; k < len; k++) {
            maxWater += Math.min(rightSum[k],leftSum[k]) - arr[k];
        }
        return maxWater;
    }
}
