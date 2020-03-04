package com.shiva.random;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-20,-10,5,10,-30,0,-35,-5,10,40,50,55};
        findThreeSum(arr);
    }

    private static void findThreeSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0){
                        System.out.println("Integers > "  + arr[i] + " : " +  arr[j]+ " : " + arr[k]);
                    }
                }
            }
        }
    }
}
