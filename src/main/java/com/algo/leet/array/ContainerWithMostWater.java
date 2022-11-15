package com.algo.leet.array;

class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] h1 = {1, 1};
        System.out.println(new ContainerWithMostWater().maxArea(h1));
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while(left < right) {
            int min = Math.min(height[left], height[right]);
            int lmax = min * (right - left);
            maxArea = Math.max(maxArea, lmax);
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    //O(n * n) - Time limit error
    public int maxArea1(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int lmax = 0;
            for (int j = i + 1; j < height.length; j++) {
                if (i != j) {
                    int min = Math.min(height[i], height[j]);
                    lmax = min * (j - i);
                    maxArea = Math.max(maxArea, lmax);
                }
            }
        }
        return maxArea;
    }
}