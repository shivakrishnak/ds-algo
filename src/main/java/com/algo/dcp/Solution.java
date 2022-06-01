package com.algo.dcp;

class Solution {
    public static void main(String[] args) {
        new Solution().solution(18, 2);
    }

    public int solution(int N, int K) {
        // write your code in Java SE 8
        int count = 1;
        int value = 1;
        if (value == N) {
            return count;
        }
        while (value <= N) {
            if (value == N) {
                break;
            }
            if (value == 1) {
                value++;
            }
            if (K > 0 && N - value < 8) {
                value *= 2;
                K--;
            } else {
                value++;
            }
            count++;
            System.out.println(value);
        }
        System.out.println("-- " + count);
        return count;
    }
}