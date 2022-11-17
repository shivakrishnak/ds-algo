package com.algo.leet.linkedlist;

public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode.printLinkedList(head);
        ListNode result = new RemoveNthFromEnd().removeNthFromEnd(head, 2);
        ListNode.printLinkedList(result);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        //shift right pointer to n nodes
        while (n > 0 && right != null) {
            right = right.next;
            n--;
        }
        //shift left & right pointer to the end and left pointer will be (n-1)th from the end
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}