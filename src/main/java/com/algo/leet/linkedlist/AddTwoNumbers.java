package com.algo.leet.linkedlist;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode l2 = new ListNode(5, new ListNode(9, new ListNode(7, new ListNode(8))));
        ListNode.printLinkedList(l1);
        ListNode.printLinkedList(l2);
        ListNode result = new AddTwoNumbers().addTwoNumbers(l1, l2);
        ListNode.printLinkedList(result);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int v1 = l1.val;
            int v2 = l2.val;
            int sum = v1 + v2 + carry;
            sum = sum % 10;
            carry = sum / 10;
            dummy.next = new ListNode(sum);
            l1 = l1.next;
            l2 = l2.next;
            curr = curr.next;
        }
        return dummy.next;
    }
}