package com.algo.algoexpert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {

        Arrays.sort(coins);
        int currentChange =0;
        for (int coin : coins){
            if (coin > currentChange + 1){
                return currentChange +1;
            }
            currentChange += coin;
        }
        return currentChange + 1;
    }

    @Test
    void name() {
        Assertions.assertSame(4, new NonConstructibleChange().nonConstructibleChange(new int[]{1, 2, 5}));
        Assertions.assertSame(20, new NonConstructibleChange().nonConstructibleChange(new int[]{5, 7, 1, 1, 2, 3, 22}));
    }
}
