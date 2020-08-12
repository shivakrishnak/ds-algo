package com.shiva.problems;

class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare v = new ValidPerfectSquare();
        System.out.println(v.isPerfectSquare(16));
        System.out.println(v.isPerfectSquare(14));
    }
    public boolean isPerfectSquare(int num) {
        System.out.println(Math.ceil(Math.sqrt(num)));
        System.out.println(Math.floor(Math.sqrt(num)));
        return Math.ceil(Math.sqrt(num)) - Math.floor(Math.sqrt(num)) == 0;
    }
}