package com.shiva.learn.recursion.problems;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n, 1, 2, 3);
    }

    private static void toh(int n, int A, int B, int C) {
        if (n > 0) {
            toh(n - 1, A, C, B);
                System.out.println(String.format("(%d , %d)", A,C));
            toh(n - 1, B, A, C);
        }
    }
}
