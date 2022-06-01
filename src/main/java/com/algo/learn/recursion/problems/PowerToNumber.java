package com.algo.learn.recursion.problems;

/*
Recursive Function
power(m,n) =    1                   if n =0
                power(m, n-1) * m   if n > 0
*/
public class PowerToNumber {
    public static void main(String[] args) {
        int m = 2;
        int n = 4;
        int power = recursive(m, n);
        System.out.println(String.format("%d power %d is %d", m, n, power));
    }

    private static int recursive(int m, int n) {
        if (n == 0)
            return 1;
        return recursive(m, n - 1) * m;
    }
}
