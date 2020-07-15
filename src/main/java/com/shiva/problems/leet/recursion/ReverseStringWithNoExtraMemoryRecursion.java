package com.shiva.problems.leet.recursion;

public class ReverseStringWithNoExtraMemoryRecursion {

	public static void main(String[] args) {
		printReverseString("abcdef".toCharArray());
	}

	private static void printReverseString(char[] s) {
		if (s == null && s.length < 1) {
			return ;
		}
		reverse(0, s.length - 1, s);
		for (int i = 0; i < s.length; i++) {
			System.out.println("==" + s[i]);
		}
	}

	private static void reverse(int left, int right, char[] s) {
		if(left >= right) {
			return;
		} 
		swap(left++, right--, s);
		System.out.println(" left " + s[left] + " - right - " + s[right]);
		reverse(left, right, s);
		System.out.println(" ----left " + s[left] + " - right - " + s[right]);
		
	}
	private static void swap(int left, int right, char[] arr) {
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
}
