package test;
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9}; //1,3,4,6,9,12
        int sum = 24;

        int size = arr.length - 1;
        for(int i =0; i < size; i++){  //12
            int temp = arr[i];
            Set<Integer> cache = new HashSet<>(); // 3
            for(int j = 0; j < size;j++){
                int t = sum  - (temp + arr[j]);
                if(cache.contains(sum  - (temp + arr[j]))){ //24-12-3=9
                    System.out.println(temp + ","+ arr[j] + ","+ t );
                } else {
                    cache.add(arr[j]);
                }
            }
        }
    }
}