package com.shiva.learn.recursion.problems;

/*
Recursive Function
fac(n)  =    1           if n = 0;
            fac(n-1) * n if n > 0
*/
public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fac = recursive(num);
        System.out.println("factorial : " + fac);
    }

    private static int recursive(int n) {
        if(n == 0)
            return 1;
        return recursive(n -1 ) * n;
    }
}
