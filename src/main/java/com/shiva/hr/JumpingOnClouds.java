package com.shiva.hr;

import java.io.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps= 0;
        int countinousJump=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0){
                ++jumps;
                ++countinousJump;
            }
            if(c[i] == 1){
                countinousJump = 0;
            }
            if (countinousJump == 3){
                --jumps;
            }
            //System.out.println(c[i]+ " - "+ jumps + " - " + countinousJump);
        }
        return --jumps;
    }


    public static void main(String[] args) throws IOException {
        int[] arr = {0,0 ,0 ,1 ,0 ,0};
        int res  = jumpingOnClouds(arr);
        System.out.println(res);
    }
}
