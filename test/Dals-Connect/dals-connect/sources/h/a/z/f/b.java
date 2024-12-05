package h.a.z.f;

import androidx.recyclerview.widget.RecyclerView;
import h.a.z.c.e;
import h.a.z.j.f;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscArrayQueue.java */
/* loaded from: classes2.dex */
public final class b<E> extends AtomicReferenceArray<E> implements e<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f18153f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: g, reason: collision with root package name */
    final int f18154g;

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f18155h;

    /* renamed from: i, reason: collision with root package name */
    long f18156i;

    /* renamed from: j, reason: collision with root package name */
    final AtomicLong f18157j;

    /* renamed from: k, reason: collision with root package name */
    final int f18158k;

    public b(int i2) {
        super(f.a(i2));
        this.f18154g = length() - 1;
        this.f18155h = new AtomicLong();
        this.f18157j = new AtomicLong();
        this.f18158k = Math.min(i2 / 4, f18153f.intValue());
    }

    int a(long j2) {
        return this.f18154g & ((int) j2);
    }

    int b(long j2, int i2) {
        return ((int) j2) & i2;
    }

    E c(int i2) {
        return get(i2);
    }

    @Override // h.a.z.c.f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j2) {
        this.f18157j.lazySet(j2);
    }

    void e(int i2, E e2) {
        lazySet(i2, e2);
    }

    void f(long j2) {
        this.f18155h.lazySet(j2);
    }

    @Override // h.a.z.c.f
    public boolean isEmpty() {
        return this.f18155h.get() == this.f18157j.get();
    }

    @Override // h.a.z.c.f
    public boolean offer(E e2) {
        if (e2 != null) {
            int i2 = this.f18154g;
            long j2 = this.f18155h.get();
            int b2 = b(j2, i2);
            if (j2 >= this.f18156i) {
                long j3 = this.f18158k + j2;
                if (c(b(j3, i2)) == null) {
                    this.f18156i = j3;
                } else if (c(b2) != null) {
                    return false;
                }
            }
            e(b2, e2);
            f(j2 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // h.a.z.c.e, h.a.z.c.f
    public E poll() {
        long j2 = this.f18157j.get();
        int a = a(j2);
        E c2 = c(a);
        if (c2 == null) {
            return null;
        }
        d(j2 + 1);
        e(a, null);
        return c2;
    }
}
