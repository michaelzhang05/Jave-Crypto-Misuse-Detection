package rx.n.e.n;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: BaseLinkedAtomicQueue.java */
/* loaded from: classes3.dex */
abstract class b<E> extends AbstractQueue<E> {

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<c<E>> f23154f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<c<E>> f23155g = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public final c<E> a() {
        return this.f23155g.get();
    }

    protected final c<E> b() {
        return this.f23155g.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c<E> f() {
        return this.f23154f.get();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return b() == f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(c<E> cVar) {
        this.f23155g.lazySet(cVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c<E> c2;
        c<E> b2 = b();
        c<E> f2 = f();
        int i2 = 0;
        while (b2 != f2 && i2 < Integer.MAX_VALUE) {
            do {
                c2 = b2.c();
            } while (c2 == null);
            i2++;
            b2 = c2;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c<E> w(c<E> cVar) {
        return this.f23154f.getAndSet(cVar);
    }
}
