package com.shiva.learn.recursion.types;

public class IndirectRecursion {
    public static void main(String[] args) {
        int number = 20;
        recursionA(number);
    }

    private static void recursionA(int number) {
        if (number > 0) {
            System.out.println(number);
            recursionB(number - 1);
        }
    }

    private static void recursionB(int num) {
        if (num > 0) {
            System.out.println(num);
            recursionA(num / 2);
        }
    }
}

