package com.shiva.leet;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode n = new AddTwoNumbers().addTwoNumbers(l1, l2);
		System.out.println(n.val);
	}

//	Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//	Output: 7 -> 0 -> 8
//	Explanation: 342 + 465 = 807

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode prev = new ListNode(0);
		ListNode head = prev;
		int carry =0 ;
		while (l1 != null || l2 != null || carry != 0 ) {
			ListNode curr = new ListNode(0);
			int sum = ( l1 != null ? l1.val : 0 ) + (l2 != null ? l2.val : 0 ) + carry;
			curr.val = sum % 10 ;
			carry = sum / 10;
			prev.next = curr;
			prev = curr;

			l1 = l1 == null ? l1 : l1.next;
			l2 = l2 == null ? l2 : l2.next;
		}
		return head.next;
	}
//
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		int first = 0, second = 0;
//		int sum =0 ;
//		List<Integer> sumList = new ArrayList<>();
//		ListNode t1 = l1 , t2 = l2;
//		while (t1 != null && t2 != null) {
//			int temp = t1.val + t2.val;
//			System.out.println(temp);
//			sumList.add(temp);
//			t1 = t1.next;
//			t2 = t2.next;
//		}
//		System.out.println(sumList);
//		sumList.sort(Comparator.reverseOrder());
//		for (int i = 0; i < sumList.size(); i++) {
//			sum += sumList.get(i) * Math.pow(10, i);
//			System.out.println(sum);
//		}
//		return new ListNode(sum);
//	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
