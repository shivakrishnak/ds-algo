package com.shiva.leet;

public class ValidMountainArray {

    public static void main(String[] args) {
        System.out.println(new ValidMountainArray().validMountainArray2(new int[]{0, 1, 2, 3, 2, 1, 0}));
    }

    public boolean validMountainArray2(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int start = 0, end = A.length - 1;
        while (start <= end) {
            if (A[start] < A[start + 1]) {
                start++;
            } else if (A[end - 1] > A[end]) {
                end--;
            } else {
                break;
            }
        }
        return start != 0 && end != A.length - 1 && start == end;

    }

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int N = A.length;
        int i = 0;

        while (i + 1 < N && A[i] < A[i + 1])
            i++;

        if (i == 0 || i == N - 1) {
            return false;
        }

        while (i + 1 < N && A[i] > A[i + 1])
            i++;

        return i == N - 1;

    }
}
