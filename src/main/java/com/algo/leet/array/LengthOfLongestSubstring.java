package com.algo.leet.array;

import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        Set<Character> uniq = new HashSet<>();
        while (r < s.length()) {
            if (!uniq.contains(s.charAt(r))) {
                uniq.add(s.charAt(r));
                max = Math.max(uniq.size(), max);
                r++;
            } else {
                uniq.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
        char[] chars = s.toCharArray();
        int max = 0, tMax = 0;
        String maxStr = "";
        for (int i = 0; i < chars.length; i++) {
            tMax = 0;
            Set<String> unique = new HashSet<>();
            for (int j = i; j < chars.length; j++) {
                if (unique.contains(String.valueOf(chars[j]))) {
                    if (tMax > max) {
                        maxStr = s.substring(i, j);
                        max = tMax;
                    }
                    break;
                } else {
                    unique.add(String.valueOf(chars[j]));
                    tMax++;
                }
            }
            max = tMax > max ? tMax : max;
        }
        return max;
    }

    public static void main(String[] args) {
        new LengthOfLongestSubstring().lengthOfLongestSubstring("aab");
    }
}