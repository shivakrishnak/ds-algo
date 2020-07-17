package com.shiva.learn.recursion.problems;

public class Combinations {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        int val = recursive(n,r);
        System.out.println("Value is : " + val);
    }

    private static int recursive(int n, int r) {
        int t1 = factorial(n);
        int t2 = factorial(r);
        int t3 = factorial(n - r);
        return t1/(t2 * t3);
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;
        return factorial(n-1) * n;

    }
}
