package rx.n.e.o;

/* compiled from: MpscLinkedQueue.java */
/* loaded from: classes3.dex */
public final class i<E> extends a<E> {
    public i() {
        rx.n.e.n.c<E> cVar = new rx.n.e.n.c<>();
        this.consumerNode = cVar;
        w(cVar);
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        if (e2 != null) {
            rx.n.e.n.c<E> cVar = new rx.n.e.n.c<>(e2);
            w(cVar).d(cVar);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue
    public E peek() {
        rx.n.e.n.c<E> c2;
        rx.n.e.n.c<E> cVar = this.consumerNode;
        rx.n.e.n.c<E> c3 = cVar.c();
        if (c3 != null) {
            return c3.b();
        }
        if (cVar == a()) {
            return null;
        }
        do {
            c2 = cVar.c();
        } while (c2 == null);
        return c2.b();
    }

    @Override // java.util.Queue
    public E poll() {
        rx.n.e.n.c<E> c2;
        rx.n.e.n.c<E> b2 = b();
        rx.n.e.n.c<E> c3 = b2.c();
        if (c3 != null) {
            E a = c3.a();
            o(c3);
            return a;
        }
        if (b2 == a()) {
            return null;
        }
        do {
            c2 = b2.c();
        } while (c2 == null);
        E a2 = c2.a();
        this.consumerNode = c2;
        return a2;
    }

    protected rx.n.e.n.c<E> w(rx.n.e.n.c<E> cVar) {
        rx.n.e.n.c<E> cVar2;
        do {
            cVar2 = this.producerNode;
        } while (!z.a.compareAndSwapObject(this, e.f23178f, cVar2, cVar));
        return cVar2;
    }
}
