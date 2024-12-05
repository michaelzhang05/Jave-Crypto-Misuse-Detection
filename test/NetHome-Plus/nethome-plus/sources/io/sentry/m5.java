package io.sentry;

import java.util.Queue;

/* compiled from: SynchronizedQueue.java */
/* loaded from: classes2.dex */
final class m5<E> extends l5<E> implements Queue<E> {
    private m5(Queue<E> queue) {
        super(queue);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> m5<E> f(Queue<E> queue) {
        return new m5<>(queue);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.l5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Queue<E> a() {
        return (Queue) super.a();
    }

    @Override // java.util.Queue
    public E element() {
        E element;
        synchronized (this.f19019g) {
            element = a().element();
        }
        return element;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f19019g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection
    public int hashCode() {
        int hashCode;
        synchronized (this.f19019g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        boolean offer;
        synchronized (this.f19019g) {
            offer = a().offer(e2);
        }
        return offer;
    }

    @Override // java.util.Queue
    public E peek() {
        E peek;
        synchronized (this.f19019g) {
            peek = a().peek();
        }
        return peek;
    }

    @Override // java.util.Queue
    public E poll() {
        E poll;
        synchronized (this.f19019g) {
            poll = a().poll();
        }
        return poll;
    }

    @Override // java.util.Queue
    public E remove() {
        E remove;
        synchronized (this.f19019g) {
            remove = a().remove();
        }
        return remove;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] array;
        synchronized (this.f19019g) {
            array = a().toArray();
        }
        return array;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        T[] tArr2;
        synchronized (this.f19019g) {
            tArr2 = (T[]) a().toArray(tArr);
        }
        return tArr2;
    }
}
