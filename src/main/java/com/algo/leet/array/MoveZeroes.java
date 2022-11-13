package com.algo.leet.array;

//https://leetcode.com/problems/move-zeroes/description/
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int z = 0;
        for(int i  =0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[z];
                nums[z] = temp;
                z++;
            }
        }
    }

    public void moveZeroes1(int[] nums) {
        int size = nums.length;
        int idx = 0;
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) {
                res[idx] = nums[i];
                idx++;
            }
        }
        while (idx < size) {
            res[idx] = 0;
            idx++;
        }
        for (int i = 0; i < size; i++) {
            nums[i] = res[i];
        }
    }

    public static void main(String[] args) {
        new MoveZeroes().moveZeroes1(new int[]{0, 1, 0, 3, 12});
    }
}