package hr;

import java.io.*;

/**
 * @author Shiva Krishna K
 *
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int result = 0;
        int level = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                ++level;
            } else if (s.charAt(i) == 'D'){
                --level;
            }

            //System.out.println(s.charAt(i)+ " " + level);
            if (level == 0 && s.charAt(i) == 'U'){
                ++result;
            }
        }
        return result;
    }



    public static void main(String[] args) throws IOException {
        int res = countingValleys(8, "UDDDUDUU");
        System.out.println(res);
    }
}
