package com.shiva.leet;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            System.out.println("");
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
