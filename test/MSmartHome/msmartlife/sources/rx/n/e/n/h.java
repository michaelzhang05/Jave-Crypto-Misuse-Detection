package rx.n.e.n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.n.e.o.j;

/* compiled from: SpscUnboundedAtomicArrayQueue.java */
/* loaded from: classes3.dex */
public final class h<T> implements Queue<T> {

    /* renamed from: f, reason: collision with root package name */
    static final int f23171f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f23172g = new Object();

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f23173h;

    /* renamed from: i, reason: collision with root package name */
    int f23174i;

    /* renamed from: j, reason: collision with root package name */
    long f23175j;

    /* renamed from: k, reason: collision with root package name */
    int f23176k;
    AtomicReferenceArray<Object> l;
    int m;
    AtomicReferenceArray<Object> n;
    final AtomicLong o;

    public h(int i2) {
        int b2 = j.b(Math.max(8, i2));
        int i3 = b2 - 1;
        this.f23173h = new AtomicLong();
        this.o = new AtomicLong();
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b2 + 1);
        this.l = atomicReferenceArray;
        this.f23176k = i3;
        a(b2);
        this.n = atomicReferenceArray;
        this.m = i3;
        this.f23175j = i3 - 1;
        Q(0L);
    }

    private AtomicReferenceArray<Object> D(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) z(atomicReferenceArray, b(atomicReferenceArray.length() - 1));
    }

    private long J() {
        return this.f23173h.get();
    }

    private T K(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.n = atomicReferenceArray;
        return (T) z(atomicReferenceArray, f(j2, i2));
    }

    private T L(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.n = atomicReferenceArray;
        int f2 = f(j2, i2);
        T t = (T) z(atomicReferenceArray, f2);
        if (t == null) {
            return null;
        }
        N(j2 + 1);
        O(atomicReferenceArray, f2, null);
        return t;
    }

    private void M(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.l = atomicReferenceArray2;
        this.f23175j = (j3 + j2) - 1;
        Q(j2 + 1);
        O(atomicReferenceArray2, i2, t);
        P(atomicReferenceArray, atomicReferenceArray2);
        O(atomicReferenceArray, i2, f23172g);
    }

    private void N(long j2) {
        this.o.lazySet(j2);
    }

    private static void O(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void P(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        O(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void Q(long j2) {
        this.f23173h.lazySet(j2);
    }

    private boolean R(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        Q(j2 + 1);
        O(atomicReferenceArray, i2, t);
        return true;
    }

    private void a(int i2) {
        this.f23174i = Math.min(i2 / 4, f23171f);
    }

    private static int b(int i2) {
        return i2;
    }

    private static int f(long j2, int i2) {
        return b(((int) j2) & i2);
    }

    private long o() {
        return this.o.get();
    }

    private long w() {
        return this.f23173h.get();
    }

    private long x() {
        return this.o.get();
    }

    private static <E> Object z(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    @Override // java.util.Queue, java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return J() == x();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        t.getClass();
        AtomicReferenceArray<Object> atomicReferenceArray = this.l;
        long w = w();
        int i2 = this.f23176k;
        int f2 = f(w, i2);
        if (w < this.f23175j) {
            return R(atomicReferenceArray, t, w, f2);
        }
        long j2 = this.f23174i + w;
        if (z(atomicReferenceArray, f(j2, i2)) == null) {
            this.f23175j = j2 - 1;
            return R(atomicReferenceArray, t, w, f2);
        }
        if (z(atomicReferenceArray, f(1 + w, i2)) != null) {
            return R(atomicReferenceArray, t, w, f2);
        }
        M(atomicReferenceArray, w, f2, t, i2);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.n;
        long o = o();
        int i2 = this.m;
        T t = (T) z(atomicReferenceArray, f(o, i2));
        return t == f23172g ? K(D(atomicReferenceArray), o, i2) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.n;
        long o = o();
        int i2 = this.m;
        int f2 = f(o, i2);
        T t = (T) z(atomicReferenceArray, f2);
        boolean z = t == f23172g;
        if (t == null || z) {
            if (z) {
                return L(D(atomicReferenceArray), o, i2);
            }
            return null;
        }
        N(o + 1);
        O(atomicReferenceArray, f2, null);
        return t;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public int size() {
        long x = x();
        while (true) {
            long J = J();
            long x2 = x();
            if (x == x2) {
                return (int) (J - x2);
            }
            x = x2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }
}
