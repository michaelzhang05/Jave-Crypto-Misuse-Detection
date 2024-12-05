package rx.n.e.o;

/* compiled from: SpmcArrayQueue.java */
/* loaded from: classes3.dex */
public final class k<E> extends o<E> {
    public k(int i2) {
        super(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return L() == D();
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 != null) {
            E[] eArr = this.f23183j;
            long j2 = this.f23182i;
            long D = D();
            long a = a(D);
            if (w(eArr, a) != null) {
                if (D - L() > j2) {
                    return false;
                }
                do {
                } while (w(eArr, a) != null);
            }
            z(eArr, a, e2);
            J(D + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // java.util.Queue
    public E peek() {
        E o;
        long M = M();
        do {
            long L = L();
            if (L >= M) {
                long D = D();
                if (L >= D) {
                    return null;
                }
                N(D);
            }
            o = o(a(L));
        } while (o == null);
        return o;
    }

    @Override // java.util.Queue, rx.n.e.o.h
    public E poll() {
        long L;
        long M = M();
        do {
            L = L();
            if (L >= M) {
                long D = D();
                if (L >= D) {
                    return null;
                }
                N(D);
            }
        } while (!K(L, 1 + L));
        long a = a(L);
        E[] eArr = this.f23183j;
        E f2 = f(eArr, a);
        x(eArr, a, null);
        return f2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        long L = L();
        while (true) {
            long D = D();
            long L2 = L();
            if (L == L2) {
                return (int) (D - L2);
            }
            L = L2;
        }
    }
}
