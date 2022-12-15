package com.algo.leet.linkedlist;


public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode.printLinkedList(head);
        ListNode result = new ReverseLinkedList().reverseList2(head);
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

    //Iterative - new LL
    public ListNode reverseList2(ListNode head) {
        ListNode curr = null;
        ListNode dummy = null;
        while (head != null) {
            curr = head;
            head = head.next;
            curr.next = dummy;
            dummy = curr;
        }
        return curr;
    }
}