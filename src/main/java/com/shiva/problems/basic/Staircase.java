package com.shiva.problems.basic;

import java.util.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        staircase(4);
    }
}
