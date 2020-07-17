package com.shiva.learn.recursion.problems;

public class CombinationsWithPascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        int val = recursive(n, r);
        System.out.println("Value is : " + val);
    }

    private static int recursive(int n, int r) {
        if (r == 0 || n == r)
            return 1;
        return recursive(n - 1, r - 1) + recursive(n - 1, r);
    }

}
