package com.algo.dcp;

import com.ds.LLNode;

public class KthToLastNodeLinkedList {
    public static void main(String[] args) {
        LLNode root = new LLNode(1, new LLNode(2, new LLNode(3, new LLNode(4, new LLNode(5, new LLNode(6))))));
        traverse(root);
        brute(root, 2);
        System.out.println(find(root, 2).value);
    }

    private static LLNode find(LLNode root, int k) {
        LLNode fast = root;
        LLNode slow = root;

        for (int i = 1; i < k + 1; i++) {
            System.out.println(":" + fast.value);
            fast = fast.next;
        }
        //System.out.println(fast.value);
        while (fast != null) {
            System.out.println(fast.value + " - " + slow.value);
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    private static void brute(LLNode root, int k) {
        int len = 0;
        LLNode temp = root;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (k > len) {
            return;
        }
        temp = root;
        for (int i = 1; i < len - k + 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    private static void traverse(LLNode root) {
        while (root != null) {
            System.out.print(root.value + " -> ");
            root = root.next;
        }
        System.out.println("\n");
    }
}
