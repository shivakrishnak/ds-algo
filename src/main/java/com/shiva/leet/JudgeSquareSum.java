package com.shiva.leet;

import java.util.HashSet;

class JudgeSquareSum {

    public static void main(String[] args) {
        JudgeSquareSum val = new JudgeSquareSum();
        //System.out.println(val.judgeSquareSum(25));
        System.out.println(val.judgeSquareSum(4));
        //System.out.println(val.judgeSquareSum(26));
    }

    public boolean judgeSquareSum(int c) {
        HashSet<Integer> set = new HashSet<>();
        double sqrt = Math.sqrt(c);
        for (int i = 0; i <= sqrt; i++) {
            set.add(i * i);
            if (set.contains(c - (i * i))){
                return true;
            }
            System.out.println(set);
        }
        return false;
    }

    /*public boolean judgeSquareSum(int c) {
        double sqrt = Math.floor(Math.sqrt(c));
        double i = sqrt;
        while (c > 0 && i >= 0){
            double sum = (sqrt *sqrt) + (i * i);
            i--;
            if (sum == c){
                return true;
            }
        }
        return false;
    }*/
}