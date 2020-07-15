package com.shiva.learn.recursion;

public class TailRecursion {
    public static void main(String[] args) {
        int number = 4;
        recursion(number);
    }

    private static void recursion(int number) {
        if (number > 0) {
            System.out.println(number);
            recursion(number - 1);
        }
    }
}

