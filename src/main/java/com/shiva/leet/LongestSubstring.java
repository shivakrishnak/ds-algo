package com.shiva.leet;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {
	public static void main(String[] args) {
		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.lengthOfLongestSubstring("pwwkew"));
	}

	public int lengthOfLongestSubstring(String s) {
		int left = 0, right = 0;
		int max = 0;

		Set<Character> hash = new HashSet<>();

		while (right < s.length()) {
			if (!hash.contains(s.charAt(right))) {
				System.out.println("if " + hash);
				hash.add(s.charAt(right));
				right++;
				max = Math.max(max, hash.size());
			} else {
				hash.remove(s.charAt(left));
				left++;
			}
		}
		return max;
	}
	
}