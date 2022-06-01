package com.algo.learn.recursion.problems;


/*
*   Recursive Function
*   sum(n)  =   0            if n = 0
*               sum(n-1) + n if n > 0
*/
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int number = 10;
        int sum = recursion(number);
        System.out.println("Sum : " + sum);
    }

    private static int recursion(int number) {
        if (number == 0)
            return 0;
        return recursion(number -1 ) + number;
    }
}
