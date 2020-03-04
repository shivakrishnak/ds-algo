package com.shiva.basic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        //00 01 02 03
        //10 11 12 13
        //20 21 22 23
        //30 31 32 33
        int firstSum = 0, lastSum = 0, k = arr.size();
        for (int i = 0; i < arr.size(); i++) {
            firstSum += arr.get(i).get(i);
            lastSum += arr.get(i).get(k - 1 - i);
        }
        return Math.abs(firstSum - lastSum);
    }

}