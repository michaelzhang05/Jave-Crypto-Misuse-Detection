package rx.n.e.n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.n.e.o.j;

/* compiled from: SpscLinkedArrayQueue.java */
/* loaded from: classes3.dex */
public final class g<T> implements Queue<T> {

    /* renamed from: f, reason: collision with root package name */
    static final int f23165f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f23166g = new Object();

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f23167h;

    /* renamed from: i, reason: collision with root package name */
    int f23168i;

    /* renamed from: j, reason: collision with root package name */
    long f23169j;

    /* renamed from: k, reason: collision with root package name */
    int f23170k;
    AtomicReferenceArray<Object> l;
    int m;
    AtomicReferenceArray<Object> n;
    final AtomicLong o;

    public g(int i2) {
        int b2 = j.b(i2);
        int i3 = b2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(b2 + 1);
        this.l = atomicReferenceArray;
        this.f23170k = i3;
        a(b2);
        this.n = atomicReferenceArray;
        this.m = i3;
        this.f23169j = i3 - 1;
        this.f23167h = new AtomicLong();
        this.o = new AtomicLong();
    }

    private AtomicReferenceArray<Object> D(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) z(atomicReferenceArray, b(atomicReferenceArray.length() - 1));
    }

    private long J() {
        return this.f23167h.get();
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
        P(atomicReferenceArray, f2, null);
        O(j2 + 1);
        return t;
    }

    private void N(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.l = atomicReferenceArray2;
        this.f23169j = (j3 + j2) - 1;
        P(atomicReferenceArray2, i2, t);
        Q(atomicReferenceArray, atomicReferenceArray2);
        P(atomicReferenceArray, i2, f23166g);
        R(j2 + 1);
    }

    private void O(long j2) {
        this.o.lazySet(j2);
    }

    private static void P(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void Q(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        P(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void R(long j2) {
        this.f23167h.lazySet(j2);
    }

    private boolean S(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        P(atomicReferenceArray, i2, t);
        R(j2 + 1);
        return true;
    }

    private void a(int i2) {
        this.f23168i = Math.min(i2 / 4, f23165f);
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
        return this.f23167h.get();
    }

    private long x() {
        return this.o.get();
    }

    private static <E> Object z(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    public boolean M(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.l;
        long J = J();
        int i2 = this.f23170k;
        long j2 = 2 + J;
        if (z(atomicReferenceArray, f(j2, i2)) == null) {
            int f2 = f(J, i2);
            P(atomicReferenceArray, f2 + 1, t2);
            P(atomicReferenceArray, f2, t);
            R(j2);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.l = atomicReferenceArray2;
        int f3 = f(J, i2);
        P(atomicReferenceArray2, f3 + 1, t2);
        P(atomicReferenceArray2, f3, t);
        Q(atomicReferenceArray, atomicReferenceArray2);
        P(atomicReferenceArray, f3, f23166g);
        R(j2);
        return true;
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
        AtomicReferenceArray<Object> atomicReferenceArray = this.l;
        long w = w();
        int i2 = this.f23170k;
        int f2 = f(w, i2);
        if (w < this.f23169j) {
            return S(atomicReferenceArray, t, w, f2);
        }
        long j2 = this.f23168i + w;
        if (z(atomicReferenceArray, f(j2, i2)) == null) {
            this.f23169j = j2 - 1;
            return S(atomicReferenceArray, t, w, f2);
        }
        if (z(atomicReferenceArray, f(1 + w, i2)) == null) {
            return S(atomicReferenceArray, t, w, f2);
        }
        N(atomicReferenceArray, w, f2, t, i2);
        return true;
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.n;
        long o = o();
        int i2 = this.m;
        T t = (T) z(atomicReferenceArray, f(o, i2));
        return t == f23166g ? K(D(atomicReferenceArray), o, i2) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.n;
        long o = o();
        int i2 = this.m;
        int f2 = f(o, i2);
        T t = (T) z(atomicReferenceArray, f2);
        boolean z = t == f23166g;
        if (t == null || z) {
            if (z) {
                return L(D(atomicReferenceArray), o, i2);
            }
            return null;
        }
        P(atomicReferenceArray, f2, null);
        O(o + 1);
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
