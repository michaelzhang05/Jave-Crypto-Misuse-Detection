package h.a.z.f;

import h.a.z.c.e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MpscLinkedQueue.java */
/* loaded from: classes2.dex */
public final class a<T> implements e<T> {

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<C0258a<T>> f18150f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<C0258a<T>> f18151g = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MpscLinkedQueue.java */
    /* renamed from: h.a.z.f.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0258a<E> extends AtomicReference<C0258a<E>> {

        /* renamed from: f, reason: collision with root package name */
        private E f18152f;

        C0258a() {
        }

        public E a() {
            E b2 = b();
            e(null);
            return b2;
        }

        public E b() {
            return this.f18152f;
        }

        public C0258a<E> c() {
            return get();
        }

        public void d(C0258a<E> c0258a) {
            lazySet(c0258a);
        }

        public void e(E e2) {
            this.f18152f = e2;
        }

        C0258a(E e2) {
            e(e2);
        }
    }

    public a() {
        C0258a<T> c0258a = new C0258a<>();
        d(c0258a);
        e(c0258a);
    }

    C0258a<T> a() {
        return this.f18151g.get();
    }

    C0258a<T> b() {
        return this.f18151g.get();
    }

    C0258a<T> c() {
        return this.f18150f.get();
    }

    @Override // h.a.z.c.f
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(C0258a<T> c0258a) {
        this.f18151g.lazySet(c0258a);
    }

    C0258a<T> e(C0258a<T> c0258a) {
        return this.f18150f.getAndSet(c0258a);
    }

    @Override // h.a.z.c.f
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // h.a.z.c.f
    public boolean offer(T t) {
        if (t != null) {
            C0258a<T> c0258a = new C0258a<>(t);
            e(c0258a).d(c0258a);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // h.a.z.c.e, h.a.z.c.f
    public T poll() {
        C0258a<T> c2;
        C0258a<T> a = a();
        C0258a<T> c3 = a.c();
        if (c3 != null) {
            T a2 = c3.a();
            d(c3);
            return a2;
        }
        if (a == c()) {
            return null;
        }
        do {
            c2 = a.c();
        } while (c2 == null);
        T a3 = c2.a();
        d(c2);
        return a3;
    }
}
