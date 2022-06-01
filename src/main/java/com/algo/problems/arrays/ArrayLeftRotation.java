package com.algo.problems.arrays;
import java.io.*;
import java.util.*;

public class ArrayLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            int idx = i + d;
            System.out.println(" i " + i + "  idx " + idx);
            if(idx > size -1 ) idx = Math.abs(idx - size);
            System.out.println("  idx " + idx);
            res[i] =  a[idx];
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] nd = scanner.nextLine().split(" ");

        // int n = Integer.parseInt(nd[0]);

        // int d = Integer.parseInt(nd[1]);

        // int[] a = new int[n];

        // String[] aItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // for (int i = 0; i < n; i++) {
        //     int aItem = Integer.parseInt(aItems[i]);
        //     a[i] = aItem;
        // }
        int[] a = {1,2,3,4,5};
        int d = 2;
        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.println("Rotated " + result[i]);
        }
        // for (int i = 0; i < result.length; i++) {
        //     bufferedWriter.write(String.valueOf(result[i]));

        //     if (i != result.length - 1) {
        //         bufferedWriter.write(" ");
        //     }
        // }

        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
    }
}
