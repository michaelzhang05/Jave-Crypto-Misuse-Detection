package h.a.z.e.e;

import h.a.s;
import h.a.u;
import h.a.w;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleFlatMap.java */
/* loaded from: classes2.dex */
public final class b<T, R> extends s<R> {
    final w<? extends T> a;

    /* renamed from: b, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends w<? extends R>> f18136b;

    /* compiled from: SingleFlatMap.java */
    /* loaded from: classes2.dex */
    static final class a<T, R> extends AtomicReference<h.a.x.c> implements u<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final u<? super R> f18137f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends w<? extends R>> f18138g;

        /* compiled from: SingleFlatMap.java */
        /* renamed from: h.a.z.e.e.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static final class C0257a<R> implements u<R> {

            /* renamed from: f, reason: collision with root package name */
            final AtomicReference<h.a.x.c> f18139f;

            /* renamed from: g, reason: collision with root package name */
            final u<? super R> f18140g;

            C0257a(AtomicReference<h.a.x.c> atomicReference, u<? super R> uVar) {
                this.f18139f = atomicReference;
                this.f18140g = uVar;
            }

            @Override // h.a.u
            public void b(h.a.x.c cVar) {
                h.a.z.a.c.o(this.f18139f, cVar);
            }

            @Override // h.a.u
            public void onError(Throwable th) {
                this.f18140g.onError(th);
            }

            @Override // h.a.u
            public void onSuccess(R r) {
                this.f18140g.onSuccess(r);
            }
        }

        a(u<? super R> uVar, h.a.y.f<? super T, ? extends w<? extends R>> fVar) {
            this.f18137f = uVar;
            this.f18138g = fVar;
        }

        @Override // h.a.u
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.C(this, cVar)) {
                this.f18137f.b(this);
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

        @Override // h.a.u
        public void onError(Throwable th) {
            this.f18137f.onError(th);
        }

        @Override // h.a.u
        public void onSuccess(T t) {
            try {
                w wVar = (w) h.a.z.b.b.c(this.f18138g.a(t), "The single returned by the mapper is null");
                if (f()) {
                    return;
                }
                wVar.b(new C0257a(this, this.f18137f));
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.f18137f.onError(th);
            }
        }
    }

    public b(w<? extends T> wVar, h.a.y.f<? super T, ? extends w<? extends R>> fVar) {
        this.f18136b = fVar;
        this.a = wVar;
    }

    @Override // h.a.s
    protected void h(u<? super R> uVar) {
        this.a.b(new a(uVar, this.f18136b));
    }
}
