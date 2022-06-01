package com.algo.leet.recursion;

public class ReverseStringWithNoExtraMemory {

	public static void main(String[] args) {
		System.out.println("hello world");
		printReverseString("shivasy".toCharArray());
	}

	private static void printReverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		int mid = left + (right - left) / 2;
		while (left != right && left <= mid && mid <= right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			//System.out.println(" left " + s[left] + " - right - " + s[right]);
			left++;
			right--;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(" - " + s[i]);
		}
	}

	private static void swap(int left, int right, char[] arr) {
		char temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
