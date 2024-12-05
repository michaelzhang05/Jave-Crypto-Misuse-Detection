package rx.n.e.n;

/* compiled from: MpscLinkedAtomicQueue.java */
/* loaded from: classes3.dex */
public final class d<E> extends b<E> {
    public d() {
        c<E> cVar = new c<>();
        o(cVar);
        w(cVar);
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 != null) {
            c<E> cVar = new c<>(e2);
            w(cVar).d(cVar);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        c<E> c2;
        c<E> a = a();
        c<E> c3 = a.c();
        if (c3 != null) {
            return c3.b();
        }
        if (a == f()) {
            return null;
        }
        do {
            c2 = a.c();
        } while (c2 == null);
        return c2.b();
    }

    @Override // java.util.Queue
    public E poll() {
        c<E> c2;
        c<E> a = a();
        c<E> c3 = a.c();
        if (c3 != null) {
            E a2 = c3.a();
            o(c3);
            return a2;
        }
        if (a == f()) {
            return null;
        }
        do {
            c2 = a.c();
        } while (c2 == null);
        E a3 = c2.a();
        o(c2);
        return a3;
    }
}
