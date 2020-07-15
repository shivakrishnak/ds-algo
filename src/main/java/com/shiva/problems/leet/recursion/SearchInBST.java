package com.shiva.problems.leet.recursion;

//Definition for a binary tree node.
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class SearchInBST {
	public TreeNode searchBST2(TreeNode root, int val) {
		if (root == null)
			return root;
		TreeNode temp = root;
		while (temp != null) {
			if (temp.val > val) {
				temp = temp.left;
			} else if (temp.val < val) {
				temp = temp.right;
			} else {
				return temp;
			}
		}
		return temp;
	}

	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
			return root;
		if (root.val > val) {
			return searchBST(root.left, val);
		} else if (root.val < val) {
			return searchBST(root.right, val);
		}
		return root;
	}
}