package com.algo.learn.recursion.types;

public class NestedRecursion {
    public static void main(String[] args) {
        int number = 95;
        System.out.println(recursion(number));
    }

    private static int recursion(int number) {
        if (number > 100) {
            return number - 10;
        } else {
            System.out.println(number);
            return recursion(recursion(number + 11));

        }
    }
}

