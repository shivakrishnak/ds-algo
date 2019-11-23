package hr;

import java.io.*;

/**
 * @author Shiva Krishna K
 *
 * https://www.hackerrank.com/challenges/sock-merchant/
 */
public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count =0;
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0){
                for (int j = i+1; j < n ; j++){
                    //System.out.println(ar[i] + " "+ ar[j]);
                    if (ar[i] == ar[j]){
                        //System.out.println("-------");
                        ar[j] = 0;
                        ar[i] = 0;
                        ++count;
                        break;
                    }
                }
            }
        }
        return count;
    }



    public static void main(String[] args) throws IOException {
        int[] arr = {10,20,20 ,10 ,10 ,30, 50, 10, 20};
        int res =  sockMerchant(9, arr);
        System.out.println(res);
    }
}
