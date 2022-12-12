package com.algo.leet.array;

import java.util.HashSet;
import java.util.Set;

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dist = new HashSet<>();
        for (int n : nums) {
            if (dist.contains(n)) {
                return true;
            }
            dist.add(n);
        }
        return false;
    }
}