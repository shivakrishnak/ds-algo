package com.algo.leet;


public class SecondLargestCount {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = {8, 3, 6, 7, 4, 8, 7, 9};
        find(arr);
    }

    private static void find(int[] arr) {
        int[] countArr = new int[10];
        int max1 = 0, max2 = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
                maxCount = 0;
            } else if (num > max2) {
                max2 = num;
                maxCount = 0;
            }
            countArr[arr[i]] = countArr[arr[i]] + 1;
            /*if(max2 ==num){
                maxCount++;
            }*/
        }
        for (int i = 0; i < countArr.length; i++) {
            System.out.println("countArr : " + countArr[i]);
        }
        System.out.println("Max1 : " + max1 + " : Max2 : " + max2);
        System.out.println("MaxCount : " + countArr[max2]);
    }
}
