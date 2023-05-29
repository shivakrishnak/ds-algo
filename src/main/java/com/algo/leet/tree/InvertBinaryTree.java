package com.algo.leet.tree;

class InvertBinaryTree {

    public static void main(String[] args) {
        InvertBinaryTree sol = new InvertBinaryTree();
        TreeNode input = TreeNodeUtil.getRightSkewBinaryTree1();
        TreeNodeUtil.print("Input", input, true);
        TreeNode root = sol.invertTree(input);
        TreeNodeUtil.print("Output", root, true);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}