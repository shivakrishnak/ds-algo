package com.algo.learn.linkedlist.problems;

import com.ds.LLNode;

public class FindMiddle {
    public static void main(String[] args) {
        LLNode root = new LLNode(1, new LLNode(2, new LLNode(3, new LLNode(4, new LLNode(5)))));
        System.out.println(find(root).value);
    }

    private static LLNode find(LLNode root) {
        if (root.next == null) return root;
        LLNode slow = root;
        LLNode fast = root;
        while (fast != null && fast.next != null) {
            System.out.println(slow.value + " - " + fast.value);
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static LLNode find1(LLNode root) {
        int length = length(root);
        int mid = length / 2;
        LLNode temp = root;
        for (int i = 0; i < mid + 1; i++) {
            temp = root.next;
        }
        return temp;
    }

    private static int length(LLNode root) {
        int len = 0;
        LLNode temp = root;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }
}
