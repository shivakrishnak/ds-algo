package com.shiva.learn.recursion.problems;

/*
 * https://www.mathsisfun.com/algebra/taylor-series.html
 *
 */
public class TaylorSeriesWithHornersRule {
    static float sr = 1;

    public static void main(String[] args) {
        float x = 2;
        float n = 3;
        float val = recursive(x, n);
        System.out.println("Recursive Value : " + val);
        float val2 = iterative(x, n);
        System.out.println("Iterative Value : " + val2);
    }

    private static float iterative(float x, float n) {
        float si = 1;
        while (n > 0) {
            si = 1 + (x * si / n);
            n--;
        }
        return si;
    }

    private static float recursive(float x, float n) {
        if (n == 0) {
            return sr;
        } else {
            sr = 1 + (x * sr / n);
            return recursive(x, n - 1);
        }
    }
}
