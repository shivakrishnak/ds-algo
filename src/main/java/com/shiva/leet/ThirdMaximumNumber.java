package com.shiva.leet;

public class ThirdMaximumNumber {
	public static void main(String[] args) {
		ThirdMaximumNumber max = new ThirdMaximumNumber();
		System.out.println(max.thirdMax(new int[]{1,2,-2147483648}));
	}
	public int thirdMax(int[] nums) {
		Integer m1 = null;
		Integer m2 = null;
		Integer m3 = null;
		for (Integer n : nums) {
			if (n.equals(m1) || n.equals(m2) || n.equals(m3)) continue;
			if (m1 == null || n > m1) {
				m3 = m2;
				m2 = m1;
				m1 = n;
			}
			else if(m2 == null || (n < m1 && n > m2)) {
				m3 = m2;
				m2 = n;
			}
			else if(m3 == null || (n < m1 && n < m2 && n > m3)) {
				m3 = n;
			}
		}
		System.out.println("m1 : " + m1 + " m2 : " + m2 + " m3 : " + m3);
		return m3 == null ? m1 : m3;
	}
}