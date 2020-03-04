package basic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

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
