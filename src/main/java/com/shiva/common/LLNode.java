package com.shiva.common;

public class LLNode {
    public int value;
    public LLNode next;

    public LLNode(int value) {
        this.value = value;
    }

    public LLNode(int value, LLNode next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
