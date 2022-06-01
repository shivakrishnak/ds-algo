package com.algo.learn.recursion.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 11;
        //int val = fiboWithLoop(n);
        System.out.println(fiboWithRecursion(n));
        System.out.println(fiboWithRecursionMemoization(n));

    }

    private static int fiboWithRecursionMemoization(int n) {
        int[] mem = new int[n + 2];
        if (n <= 1) {
            mem[n] = n;
            return n;
        } else {
            if (mem[n - 1] == 0) {
                mem[n - 1] = fiboWithRecursion(n - 1);
            }
            if (mem[n - 2] == 0) {
                mem[n - 2] = fiboWithRecursion(n - 2);
            }
            return mem[n - 1] + mem[n - 2];
        }
    }

    private static int fiboWithRecursion(int n) {
        if (n <= 1)
            return n;
        return fiboWithRecursion(n - 1) + fiboWithRecursion(n - 2);
    }

    private static int fiboWithLoop(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i <= n; i++) {
            if (i <= 1)
                System.out.println(i);
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
        return c;
    }
}
