package com.algo.leet.linkedlist;

public class ReversePrint {


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode.printLinkedList(head);
        new ReversePrint().reverse(head);

    }

    private void reverse(ListNode head) {
        if (head == null){
            return;
        }
        reverse(head.next);
        System.out.println(head.val + " -> ");
    }

}
