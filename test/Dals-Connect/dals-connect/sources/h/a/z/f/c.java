package h.a.z.f;

import androidx.recyclerview.widget.RecyclerView;
import h.a.z.c.e;
import h.a.z.j.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue.java */
/* loaded from: classes2.dex */
public final class c<T> implements e<T> {

    /* renamed from: f, reason: collision with root package name */
    static final int f18159f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT).intValue();

    /* renamed from: g, reason: collision with root package name */
    private static final Object f18160g = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f18162i;

    /* renamed from: j, reason: collision with root package name */
    long f18163j;

    /* renamed from: k, reason: collision with root package name */
    final int f18164k;
    AtomicReferenceArray<Object> l;
    final int m;
    AtomicReferenceArray<Object> n;

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f18161h = new AtomicLong();
    final AtomicLong o = new AtomicLong();

    public c(int i2) {
        int a = f.a(Math.max(8, i2));
        int i3 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.l = atomicReferenceArray;
        this.f18164k = i3;
        a(a);
        this.n = atomicReferenceArray;
        this.m = i3;
        this.f18163j = i3 - 1;
        p(0L);
    }

    private void a(int i2) {
        this.f18162i = Math.min(i2 / 4, f18159f);
    }

    private static int b(int i2) {
        return i2;
    }

    private static int c(long j2, int i2) {
        return b(((int) j2) & i2);
    }

    private long d() {
        return this.o.get();
    }

    private long e() {
        return this.f18161h.get();
    }

    private long f() {
        return this.o.get();
    }

    private static <E> Object g(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        return atomicReferenceArray.get(i2);
    }

    private AtomicReferenceArray<Object> h(AtomicReferenceArray<Object> atomicReferenceArray, int i2) {
        int b2 = b(i2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) g(atomicReferenceArray, b2);
        n(atomicReferenceArray, b2, null);
        return atomicReferenceArray2;
    }

    private long j() {
        return this.f18161h.get();
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2) {
        this.n = atomicReferenceArray;
        int c2 = c(j2, i2);
        T t = (T) g(atomicReferenceArray, c2);
        if (t != null) {
            n(atomicReferenceArray, c2, null);
            m(j2 + 1);
        }
        return t;
    }

    private void l(AtomicReferenceArray<Object> atomicReferenceArray, long j2, int i2, T t, long j3) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.l = atomicReferenceArray2;
        this.f18163j = (j3 + j2) - 1;
        n(atomicReferenceArray2, i2, t);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i2, f18160g);
        p(j2 + 1);
    }

    private void m(long j2) {
        this.o.lazySet(j2);
    }

    private static void n(AtomicReferenceArray<Object> atomicReferenceArray, int i2, Object obj) {
        atomicReferenceArray.lazySet(i2, obj);
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j2) {
        this.f18161h.lazySet(j2);
    }

    private boolean q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j2, int i2) {
        n(atomicReferenceArray, i2, t);
        p(j2 + 1);
        return true;
    }

    @Override // h.a.z.c.f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // h.a.z.c.f
    public boolean isEmpty() {
        return j() == f();
    }

    @Override // h.a.z.c.f
    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.l;
            long e2 = e();
            int i2 = this.f18164k;
            int c2 = c(e2, i2);
            if (e2 < this.f18163j) {
                return q(atomicReferenceArray, t, e2, c2);
            }
            long j2 = this.f18162i + e2;
            if (g(atomicReferenceArray, c(j2, i2)) == null) {
                this.f18163j = j2 - 1;
                return q(atomicReferenceArray, t, e2, c2);
            }
            if (g(atomicReferenceArray, c(1 + e2, i2)) == null) {
                return q(atomicReferenceArray, t, e2, c2);
            }
            l(atomicReferenceArray, e2, c2, t, i2);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // h.a.z.c.e, h.a.z.c.f
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.n;
        long d2 = d();
        int i2 = this.m;
        int c2 = c(d2, i2);
        T t = (T) g(atomicReferenceArray, c2);
        boolean z = t == f18160g;
        if (t == null || z) {
            if (z) {
                return k(h(atomicReferenceArray, i2 + 1), d2, i2);
            }
            return null;
        }
        n(atomicReferenceArray, c2, null);
        m(d2 + 1);
        return t;
    }
}
