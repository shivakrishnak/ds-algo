package com.shiva.leet.recursion;

//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int x) { val = x; }
//  }
 
public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		ReverseLinkedList ll = new ReverseLinkedList();
		ll.reverseList(head);
		
	}
	
	public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt;
        while (curr != null) {
        	nxt = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = nxt;
		}
        return prev;
    }
	
	public ListNode reverseListRecursion(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt;
        while (curr != null) {
        	nxt = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = nxt;
		}
        return prev;
    }
}