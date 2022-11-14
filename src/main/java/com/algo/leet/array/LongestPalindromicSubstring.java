package com.algo.leet.array;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(new LongestPalindromicSubstring().longestPalindrome("abb"));
    }

    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        String maxStr = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd-length string
            int l = i, r = i;
            while (l >= 0 & r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxStr = s.substring(l, r + 1);
                    maxLength = r - l + 1;
                }
                l--;
                r++;
            }
            //even-length string
            l = i;
            r = i + 1;
            while (l >= 0 & r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxStr = s.substring(l, r + 1);
                    maxLength = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return maxStr;
    }

    //Does not work - Timeout Error
    public String longestPalindrome1(String s) {
        String maxString = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String strToCheck = s.substring(i, j + 1);
                if (isPalindrome(strToCheck)) {
                    System.out.println(strToCheck);
                    if (maxLength < strToCheck.length()) {
                        maxString = strToCheck;
                        maxLength = strToCheck.length();
                    }
                }
            }
        }
        return maxString;
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (s.length() > 0 && l < s.length() & l != r) {
            if (!(s.charAt(l++) == s.charAt(r--))) {
                return false;
            }
        }
        return true;
    }
}
