package com.shiva.problems.leet.recursion;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("hello world");
		printReverseString("Shiva");
	}

	private static void printReverseString(String str) {
		helper(0, str.toCharArray());
	}

	private static void helper(int i, char[] charArray) {
		if(charArray == null || i >= charArray.length) {
			return ;
		}
		System.out.println(charArray[i]);
		helper(i + 1, charArray);
	}
}
