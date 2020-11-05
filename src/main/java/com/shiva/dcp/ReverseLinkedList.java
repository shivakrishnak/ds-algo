package com.shiva.dcp;

import com.shiva.common.LLNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LLNode root = new LLNode(1, new LLNode(2, new LLNode(3, new LLNode(4))));
        System.out.println(root);

        traverse(root);
        System.out.println("\n --");
//        traverse2(root);
        reverse(root);
    }

    private static LLNode reverse(LLNode root) {
        LLNode current = root;
        LLNode previous = null;
        LLNode next = null;

        while (current != null) {

            next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }
        traverse(previous);
        return previous;
    }

    //Interview Cake - https://www.interviewcake.com/question/java/reverse-linked-list
    //The order of operations is important here! We're careful to copy currentNode.next into next before setting currentNode.next to previousNode.
    // Otherwise "stepping forward" at the end could actually mean stepping back to previousNode!
    public static LLNode reverseMain(LLNode headOfList) {
        LLNode currentNode = headOfList;
        LLNode previousNode = null;
        LLNode nextNode = null;

        // until we have 'fallen off' the end of the list
        while (currentNode != null) {

            // copy a pointer to the next element
            // before we overwrite currentNode.next
            nextNode = currentNode.next;

            // reverse the 'next' pointer
            currentNode.next = previousNode;

            // step forward in the list
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    private static void traverse(LLNode root) {
        if (root == null) return;
        System.out.print(root.value + " -> ");
        traverse(root.next);
    }

    private static void traverse2(LLNode root) {
        while (root != null) {
            System.out.print(root.value + " -> ");
            root = root.next;
        }
    }
}
