package rx.n.e.o;

/* compiled from: SpscArrayQueue.java */
/* loaded from: classes3.dex */
public final class s<E> extends x<E> {
    public s(int i2) {
        super(i2);
    }

    private long D() {
        return z.a.getLongVolatile(this, u.n);
    }

    private long J() {
        return z.a.getLongVolatile(this, y.m);
    }

    private void K(long j2) {
        z.a.putOrderedLong(this, u.n, j2);
    }

    private void L(long j2) {
        z.a.putOrderedLong(this, y.m, j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return J() == D();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 != null) {
            E[] eArr = this.f23183j;
            long j2 = this.producerIndex;
            long a = a(j2);
            if (w(eArr, a) != null) {
                return false;
            }
            x(eArr, a, e2);
            L(j2 + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        return o(a(this.consumerIndex));
    }

    @Override // java.util.Queue, rx.n.e.o.h
    public E poll() {
        long j2 = this.consumerIndex;
        long a = a(j2);
        E[] eArr = this.f23183j;
        E w = w(eArr, a);
        if (w == null) {
            return null;
        }
        x(eArr, a, null);
        K(j2 + 1);
        return w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long D = D();
        while (true) {
            long J = J();
            long D2 = D();
            if (D == D2) {
                return (int) (J - D2);
            }
            D = D2;
        }
    }
}
