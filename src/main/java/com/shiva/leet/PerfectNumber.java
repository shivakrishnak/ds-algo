package com.shiva.leet;

//https://leetcode.com/problems/perfect-number/
public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(new PerfectNumber().checkPerfectNumber(28));
        System.out.println(new PerfectNumber().checkPerfectNumber2(28));
    }

    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " - " + num / i);
                sum += i + num / i;
                System.out.println(sum);
            }
        }
        return num == sum;
    }

    public boolean checkPerfectNumber2(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
                sum += i;
                System.out.println(sum);
                System.out.println(" -- ");
            }
        }
        return num == sum;
    }
}
