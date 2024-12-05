package h.a.z.e.d;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableCreate.java */
/* loaded from: classes2.dex */
public final class b<T> extends h.a.m<T> {

    /* renamed from: f, reason: collision with root package name */
    final h.a.o<T> f18031f;

    /* compiled from: ObservableCreate.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicReference<h.a.x.c> implements h.a.n<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18032f;

        a(h.a.q<? super T> qVar) {
            this.f18032f = qVar;
        }

        @Override // h.a.n
        public void a(h.a.x.c cVar) {
            h.a.z.a.c.B(this, cVar);
        }

        public void b(Throwable th) {
            if (c(th)) {
                return;
            }
            h.a.a0.a.o(th);
        }

        public boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (f()) {
                return false;
            }
            try {
                this.f18032f.onError(th);
                d();
                return true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }

        @Override // h.a.x.c
        public void d() {
            h.a.z.a.c.i(this);
        }

        @Override // h.a.x.c
        public boolean f() {
            return h.a.z.a.c.n(get());
        }

        @Override // h.a.g
        public void onNext(T t) {
            if (t == null) {
                b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (f()) {
                    return;
                }
                this.f18032f.onNext(t);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public b(h.a.o<T> oVar) {
        this.f18031f = oVar;
    }

    @Override // h.a.m
    protected void x(h.a.q<? super T> qVar) {
        a aVar = new a(qVar);
        qVar.b(aVar);
        try {
            this.f18031f.a(aVar);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            aVar.b(th);
        }
    }
}
