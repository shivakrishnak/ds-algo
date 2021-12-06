package com.shiva.leet.recursion;


import com.shiva.common.ListNode;

public class LinkedListSwapNodes {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		LinkedListSwapNodes ll = new LinkedListSwapNodes();
		ll.swapPairs(head);
		
	}
    public ListNode swapPairs(ListNode head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	ListNode dummy = new ListNode(0);
    	ListNode prev = dummy;
    	dummy.next = head;
    	while (prev.next != null && prev.next.next != null) {
			ListNode first = prev.next;
			ListNode second = prev.next.next;
			first.next = second.next;
			second.next = first;
			prev.next = second;
			prev = first;
		}
        return dummy.next;
    }
    
    public ListNode swapPairsRecursion(ListNode head) {
		if (head == null && head.next == null)  {
			return head;
		}
		ListNode temp = head.next;
		head.next = swapPairs(head.next.next);
		temp.next = head;
		return temp;
		
	}
}