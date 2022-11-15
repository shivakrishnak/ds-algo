package com.algo.leet.array;

class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] h = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] h1 = {1, 1};
        System.out.println(new ContainerWithMostWater().maxArea(h));
    }

    //O(n * n) - Time limit error
    public int maxArea(int[] height) {
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