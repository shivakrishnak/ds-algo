package com.algo.leet.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeUtil {
    public static TreeNode getEvenBinaryTree1() {
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        return new TreeNode(4, left, right);
    }

    public static TreeNode getRightSkewBinaryTree1() {
        return fromArray(new Integer[]{4,2,7,1,3,6,9});
    }

    public static TreeNode fromArray(Integer[] tree) {
        if (tree.length == 0) return null;
        TreeNode root = new TreeNode(tree[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < tree.length; i++) {
            TreeNode node = q.peek();
            if (node.left == null) {
                node.left = new TreeNode(tree[i]);
                if (tree[i] != null) q.add(node.left);
            } else if (node.right == null) {
                node.right = new TreeNode(tree[i]);
                if (tree[i] != null) q.add(node.right);
                q.remove();
            }
        }
        return root;
    }

    public static void print(String prefix, TreeNode n, boolean isLeft) {
        if (n != null) {
            System.out.println (prefix + (isLeft ? "|-- " : "\\-- ") + n.val);
            print(prefix + (isLeft ? "|   " : "    "), n.left, true);
            print(prefix + (isLeft ? "|   " : "    "), n.right, false);
        }
    }

}