package rx.n.e.n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscAtomicArrayQueue.java */
/* loaded from: classes3.dex */
public final class e<E> extends a<E> {

    /* renamed from: h, reason: collision with root package name */
    private static final Integer f23157h = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: i, reason: collision with root package name */
    final AtomicLong f23158i;

    /* renamed from: j, reason: collision with root package name */
    long f23159j;

    /* renamed from: k, reason: collision with root package name */
    final AtomicLong f23160k;
    final int l;

    public e(int i2) {
        super(i2);
        this.f23158i = new AtomicLong();
        this.f23160k = new AtomicLong();
        this.l = Math.min(i2 / 4, f23157h.intValue());
    }

    private void D(long j2) {
        this.f23160k.lazySet(j2);
    }

    private void J(long j2) {
        this.f23158i.lazySet(j2);
    }

    private long x() {
        return this.f23160k.get();
    }

    private long z() {
        return this.f23158i.get();
    }

    @Override // rx.n.e.n.a, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return z() == x();
    }

    @Override // rx.n.e.n.a, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 != null) {
            AtomicReferenceArray<E> atomicReferenceArray = this.f23152f;
            int i2 = this.f23153g;
            long j2 = this.f23158i.get();
            int b2 = b(j2, i2);
            if (j2 >= this.f23159j) {
                long j3 = this.l + j2;
                if (o(atomicReferenceArray, b(j3, i2)) == null) {
                    this.f23159j = j3;
                } else if (o(atomicReferenceArray, b2) != null) {
                    return false;
                }
            }
            w(atomicReferenceArray, b2, e2);
            J(j2 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // java.util.Queue
    public E peek() {
        return f(a(this.f23160k.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j2 = this.f23160k.get();
        int a = a(j2);
        AtomicReferenceArray<E> atomicReferenceArray = this.f23152f;
        E o = o(atomicReferenceArray, a);
        if (o == null) {
            return null;
        }
        w(atomicReferenceArray, a, null);
        D(j2 + 1);
        return o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long x = x();
        while (true) {
            long z = z();
            long x2 = x();
            if (x == x2) {
                return (int) (z - x2);
            }
            x = x2;
        }
    }
}
