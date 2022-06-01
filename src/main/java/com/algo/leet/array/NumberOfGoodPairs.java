package com.algo.leet.array;

//https://leetcode.com/problems/number-of-good-pairs/
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int result = new NumberOfGoodPairs().numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        System.out.println(result);

/*        result = new NumberOfGoodPairs().numIdenticalPairs(new int[]{1, 1, 1, 1, 1});
        System.out.println(result);

        result = new NumberOfGoodPairs().numIdenticalPairs(new int[]{3, 1, 2, 10, 1});
        System.out.println(result);*/
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count / 2;
    }

    public int numIdenticalPairs1(int[] A) {
        int res = 0, count[] = new int[101];
        for (int a : A) {
            res += count[a]++;
        }
        return res;
    }
}
