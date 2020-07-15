package com.shiva.learn.recursion;

public class HeadRecursion {
    public static void main(String[] args) {
        int number = 4;
        recursion(number);
    }

    private static void recursion(int number) {
        if (number > 0) {
            recursion(number - 1);
            System.out.println(number);
        }
    }
}

