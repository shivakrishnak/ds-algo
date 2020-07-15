package com.shiva.problems.leet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/buddy-strings/
public class BuddyStrings {
	public static void main(String[] args) {
		BuddyStrings bs = new BuddyStrings();
		System.out.println(bs.buddyStrings("aa", "aa"));
	}

	public boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;

		if (A.equals(B)) {
			Set<Character> chars = new HashSet<>();
			for (int i = 0; i < A.length(); i++) {
				chars.add(A.charAt(i));
			}
			return chars.size() < B.length();
		}
		List<Integer> diff = new ArrayList<Integer>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				diff.add(i);
			}
		}
		return diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1))
				&& A.charAt(diff.get(1)) == B.charAt(diff.get(0));
	}
}