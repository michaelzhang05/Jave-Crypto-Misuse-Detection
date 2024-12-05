package rx.n.e.o;

import java.util.Iterator;

/* compiled from: ConcurrentCircularArrayQueue.java */
/* loaded from: classes3.dex */
public abstract class f<E> extends g<E> {

    /* renamed from: f, reason: collision with root package name */
    protected static final int f23179f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f23180g;

    /* renamed from: h, reason: collision with root package name */
    private static final int f23181h;

    /* renamed from: i, reason: collision with root package name */
    protected final long f23182i;

    /* renamed from: j, reason: collision with root package name */
    protected final E[] f23183j;

    static {
        int intValue = Integer.getInteger("sparse.shift", 0).intValue();
        f23179f = intValue;
        int arrayIndexScale = z.a.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            f23181h = intValue + 2;
        } else if (8 == arrayIndexScale) {
            f23181h = intValue + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        f23180g = r2.arrayBaseOffset(Object[].class) + (32 << (f23181h - intValue));
    }

    public f(int i2) {
        int b2 = j.b(i2);
        this.f23182i = b2 - 1;
        this.f23183j = (E[]) new Object[(b2 << f23179f) + 64];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long a(long j2) {
        return b(j2, this.f23182i);
    }

    protected final long b(long j2, long j3) {
        return f23180g + ((j2 & j3) << f23181h);
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
    public final E f(E[] eArr, long j2) {
        return (E) z.a.getObject(eArr, j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E o(long j2) {
        return w(this.f23183j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E w(E[] eArr, long j2) {
        return (E) z.a.getObjectVolatile(eArr, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(E[] eArr, long j2, E e2) {
        z.a.putOrderedObject(eArr, j2, e2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(E[] eArr, long j2, E e2) {
        z.a.putObject(eArr, j2, e2);
    }
}
