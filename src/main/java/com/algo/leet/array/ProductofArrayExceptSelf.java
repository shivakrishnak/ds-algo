package com.algo.leet.array;

public class ProductofArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int arrLen = nums.length;
        int[] res = new int[arrLen];
        int prefix = 1;
        int postfix = 1;
        for (int i = 0; i < arrLen; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        for (int j = arrLen - 1; j >= 0; j--) {
            res[j] = res[j] * postfix;
            postfix *= nums[j];
        }
        return res;
    }

    public int[] productExceptSelf2(int[] nums) {
        int arrLen = nums.length;
        int[] pre = new int[arrLen];
        int[] post = new int[arrLen];
        int[] res = new int[arrLen];
        pre[0] = 1;
        for (int i = 1; i < arrLen; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        post[arrLen - 1] = 1;
        for (int j = arrLen - 2; j >= 0; j--) {
            post[j] = post[j + 1] * nums[j + 1];
        }
        for (int k = 0; k < arrLen; k++) {
            res[k] = pre[k] * post[k];
        }
        return res;
    }
}