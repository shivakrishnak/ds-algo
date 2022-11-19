package com.algo.leet.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    //Floyd's Tortoise and Hare - approach
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            System.out.println("val: " + temp.val);
            if (visited.contains(temp)) {
                return true;
            }
            visited.add(temp);
            temp = temp.next;
        }
        return false;
    }
}