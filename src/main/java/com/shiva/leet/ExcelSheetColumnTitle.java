package com.shiva.leet;
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
    	String res = "";
    	while (n > 0) {
			char ch = (char)((n-1)%26 + 'A');
			n = (n-1)/26;
			res = ch + res;
		}
        return res;
    }
    
    public static void main(String[] args) {
		ExcelSheetColumnTitle ex = new ExcelSheetColumnTitle();
		System.out.println(ex.convertToTitle(34));
		
	}
}