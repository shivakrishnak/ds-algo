package com.shiva.learn.recursion.types;

public class TreeRecursion {
    public static void main(String[] args) {
        int number = 3;
        recursion(number);
    }

    private static void recursion(int number) {
        if (number > 0) {
            System.out.println(number);
            recursion(number - 1);
            recursion(number - 1);
        }
    }
}

