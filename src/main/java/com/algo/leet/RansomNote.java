package com.algo.leet;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/ransom-note/description/
public class RansomNote {
    public static void main(String[] args) {
        //System.out.println(new RansomNote().canConstruct("aa", "ab"));
        System.out.println(new RansomNote().canConstruct("aa", "aab"));
        //System.out.println(new RansomNote().canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mags = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            if (mags.containsKey(magazine.charAt(i))) {
                mags.put(magazine.charAt(i), mags.get(magazine.charAt(i)) + 1);
            }
            mags.computeIfAbsent(magazine.charAt(i), val -> 1);
        }
        System.out.println(mags);

        for (int i = 0; i < ransomNote.length(); i++) {
            Character ch = ransomNote.charAt(i);
            if (mags.containsKey(ch)) {
                if (mags.get(ch) == 1) {
                    mags.remove(ch);
                } else {
                    mags.put(ch, mags.get(ch) - 1);
                }
            } else {
                return false;
            }
        }
        System.out.println(mags);
        return true;
    }
}