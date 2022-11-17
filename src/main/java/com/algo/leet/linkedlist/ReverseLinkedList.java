package com.algo.leet.linkedlist;


public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode.printLinkedList(head);
        ListNode result = new ReverseLinkedList().reverseList(head);
        ListNode.printLinkedList(result);
    }

    //Recursive
    public ListNode reverseList(ListNode head) {
        //TODO
        return head;
    }

    //Iterative
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}