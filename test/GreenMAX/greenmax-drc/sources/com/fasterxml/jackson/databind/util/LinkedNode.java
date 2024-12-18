package com.fasterxml.jackson.databind.util;

/* loaded from: classes2.dex */
public final class LinkedNode<T> {
    private LinkedNode<T> next;
    private final T value;

    public LinkedNode(T t, LinkedNode<T> linkedNode) {
        this.value = t;
        this.next = linkedNode;
    }

    public void linkNext(LinkedNode<T> linkedNode) {
        if (this.next == null) {
            this.next = linkedNode;
            return;
        }
        throw new IllegalStateException();
    }

    public LinkedNode<T> next() {
        return this.next;
    }

    public T value() {
        return this.value;
    }
}
