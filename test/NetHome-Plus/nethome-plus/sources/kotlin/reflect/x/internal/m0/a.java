package kotlin.reflect.x.internal.m0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ConsPStack.java */
/* loaded from: classes2.dex */
final class a<E> implements Iterable<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final a<Object> f21450f = new a<>();

    /* renamed from: g, reason: collision with root package name */
    final E f21451g;

    /* renamed from: h, reason: collision with root package name */
    final a<E> f21452h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21453i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConsPStack.java */
    /* renamed from: kotlin.f0.x.e.m0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0362a<E> implements Iterator<E> {

        /* renamed from: f, reason: collision with root package name */
        private a<E> f21454f;

        public C0362a(a<E> aVar) {
            this.f21454f = aVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((a) this.f21454f).f21453i > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            a<E> aVar = this.f21454f;
            E e2 = aVar.f21451g;
            this.f21454f = aVar.f21452h;
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private a() {
        this.f21453i = 0;
        this.f21451g = null;
        this.f21452h = null;
    }

    public static <E> a<E> b() {
        return (a<E>) f21450f;
    }

    private Iterator<E> f(int i2) {
        return new C0362a(z(i2));
    }

    private a<E> w(Object obj) {
        if (this.f21453i == 0) {
            return this;
        }
        if (this.f21451g.equals(obj)) {
            return this.f21452h;
        }
        a<E> w = this.f21452h.w(obj);
        return w == this.f21452h ? this : new a<>(this.f21451g, w);
    }

    private a<E> z(int i2) {
        if (i2 < 0 || i2 > this.f21453i) {
            throw new IndexOutOfBoundsException();
        }
        return i2 == 0 ? this : this.f21452h.z(i2 - 1);
    }

    public E get(int i2) {
        if (i2 >= 0 && i2 <= this.f21453i) {
            try {
                return f(i2).next();
            } catch (NoSuchElementException unused) {
                throw new IndexOutOfBoundsException("Index: " + i2);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return f(0);
    }

    public a<E> o(int i2) {
        return w(get(i2));
    }

    public int size() {
        return this.f21453i;
    }

    public a<E> x(E e2) {
        return new a<>(e2, this);
    }

    private a(E e2, a<E> aVar) {
        this.f21451g = e2;
        this.f21452h = aVar;
        this.f21453i = aVar.f21453i + 1;
    }
}
