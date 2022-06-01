package com.algo.learn.recursion.problems;

/*
 * https://www.mathsisfun.com/algebra/taylor-series.html
 *
 */
public class TaylorSeries {
    public static float p = 1, f = 1;

    public static void main(String[] args) {
        float x = 2;
        float n = 3;
        float val = recursive(x, n);
        System.out.println("Value : " + val);
    }

    private static float recursive(float x, float n) {
        float r;
        if (n == 0) {
            return 1;
        } else {
            r = recursive(x, n - 1);
            p = p * x;
            f = f * n;
            return r + (p / f);
        }
    }
}
