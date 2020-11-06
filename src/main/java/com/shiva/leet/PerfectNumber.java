package com.shiva.leet;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(new PerfectNumber().checkPerfectNumber(28));
    }

    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sum += i + num / i;
            }
        }
        return num == sum;
    }
}
