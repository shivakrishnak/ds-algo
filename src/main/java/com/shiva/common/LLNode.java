package com.shiva.common;

public class LLNode<T extends Comparable<T>> {
    public T value;
    public LLNode next;

    public LLNode(T value) {
        this.value = value;
    }

    public LLNode(T value, LLNode next) {
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
