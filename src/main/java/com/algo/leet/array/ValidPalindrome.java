package com.algo.leet.array;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome(".,"));
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        int left = 0;
        int right = s.length() - 1;
        char lch, rch;
        while (left <= right) {
            lch = s.charAt(left);
            if (!isValid(s.charAt(left))) {
                left++;
                continue;
            }
            rch = s.charAt(right);
            if (!isValid(s.charAt(right))) {
                right--;
                continue;
            }
            System.out.println("s.charAt(left) >" + s.charAt(left) + ":" + "s.charAt(right) >" + s.charAt(right));
            if (Character.toLowerCase(lch) != Character.toLowerCase(rch)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isValid(char ch) {
        return Character.isLetter(ch) || Character.isDigit(ch);
    }
}