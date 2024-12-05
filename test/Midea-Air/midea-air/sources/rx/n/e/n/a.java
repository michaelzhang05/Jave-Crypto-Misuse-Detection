package rx.n.e.n;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.n.e.o.j;

/* compiled from: AtomicReferenceArrayQueue.java */
/* loaded from: classes3.dex */
abstract class a<E> extends AbstractQueue<E> {

    /* renamed from: f, reason: collision with root package name */
    protected final AtomicReferenceArray<E> f23152f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f23153g;

    public a(int i2) {
        int b2 = j.b(i2);
        this.f23153g = b2 - 1;
        this.f23152f = new AtomicReferenceArray<>(b2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(long j2) {
        return this.f23153g & ((int) j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b(long j2, int i2) {
        return ((int) j2) & i2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E f(int i2) {
        return o(this.f23152f, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E o(AtomicReferenceArray<E> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(AtomicReferenceArray<E> atomicReferenceArray, int i2, E e2) {
        atomicReferenceArray.lazySet(i2, e2);
    }
}
