package com.shiva.problems;

import java.util.Arrays;

class RansomNote {
    public static void main(String[] args) {
        RansomNote rn = new RansomNote();
        System.out.println(rn.canConstruct("a", "b"));
        System.out.println(rn.canConstruct("aa", "ab"));
        System.out.println(rn.canConstruct("aa", "aab"));
        System.out.println(rn.canConstruct("aab", "baa"));

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        return Arrays.asList(magazine.toCharArray()).containsAll(Arrays.asList(ransomNote.toCharArray()));
    }
}