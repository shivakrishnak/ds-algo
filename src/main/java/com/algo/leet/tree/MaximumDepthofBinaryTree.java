package com.algo.leet.tree;

class MaximumDepthofBinaryTree {


    public static void main(String[] args) {
        MaximumDepthofBinaryTree sol = new MaximumDepthofBinaryTree();
        TreeNode input = TreeNodeUtil.getRightSkewBinaryTree1();
        TreeNodeUtil.print("Input", input, true);
        int height = sol.maxDepth(input);
        System.out.println("MaxDepth: " + height);
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        System.out.println("left:" + left);
        int right = maxDepth(root.right);
        System.out.println("right:" + right);

        return Math.max(left, right) + 1;
    }
}