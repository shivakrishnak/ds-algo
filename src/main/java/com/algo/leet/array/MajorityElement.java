package com.algo.leet.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] h = {2, 2, 1, 1, 1, 2, 2};
        int[] h1 = {3, 2, 3};
        System.out.println(new MajorityElement().majorityElement(h1));
    }

    //Moores ALgorithm - https://www.cs.utexas.edu/~moore/best-ideas/mjrty/index.html
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }
            if (candidate == i) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public int majorityElement1(int[] nums) {
        if (nums.length == 1) return nums[0];
        int maxCount = 0;
        int majorEl = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            if (map.containsKey(val)) {
                int count = map.get(val) + 1;
                map.put(val, count);
                if (count > maxCount) {
                    maxCount = count;
                    majorEl = val;
                }
            } else {
                map.put(val, 1);
            }
        }
        return majorEl;
    }
}