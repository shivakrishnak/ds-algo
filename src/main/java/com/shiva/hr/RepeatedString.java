package com.shiva.hr;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/repeated-string
public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	if(!s.contains("a")) return 0;
    	if (s.length() == 1 && s.contains("a")) return n;
		
    	String fullS = "";
    	long factor = (int) (n / s.length());
    	int mod = (int) (n % s.length());
    	for (int i = 0; i < factor; i++) {
			fullS += s;
		}
    	fullS = fullS + s.substring(0,mod);
    	char[] charArr = fullS.toCharArray();
    	int count = 0;
		for (int i = 0; i < charArr.length; i++) {
			if(charArr[i] == 'a'){
				count ++;
			}
		}
		return count;

    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    	
    	long result = repeatedString("aba", 10);
    	System.out.println(result);
    	System.out.println("aba".substring(0, 0));
    	System.out.println("aba".substring(0, 1));
    	System.out.println("aba".substring(0, 2));
		while(true){
			String ss = new String("sdfldksjfsljldfjlsfdlfjkljfldjljllkjldlsjldfdsjlj");
			System.out.println(ss);
		}
    }
}
