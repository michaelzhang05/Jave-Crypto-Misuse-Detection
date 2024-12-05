package h.a.z.e.e;

import h.a.s;
import h.a.t;
import h.a.u;
import h.a.v;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleCreate.java */
/* loaded from: classes2.dex */
public final class a<T> extends s<T> {
    final v<T> a;

    /* compiled from: SingleCreate.java */
    /* renamed from: h.a.z.e.e.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0256a<T> extends AtomicReference<h.a.x.c> implements t<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final u<? super T> f18135f;

        C0256a(u<? super T> uVar) {
            this.f18135f = uVar;
        }

        public void a(Throwable th) {
            if (c(th)) {
                return;
            }
            h.a.a0.a.o(th);
        }

        @Override // h.a.t
        public void b(h.a.y.d dVar) {
            e(new h.a.z.a.a(dVar));
        }

        @Override // h.a.t
        public boolean c(Throwable th) {
            h.a.x.c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            h.a.x.c cVar = get();
            h.a.z.a.c cVar2 = h.a.z.a.c.DISPOSED;
            if (cVar == cVar2 || (andSet = getAndSet(cVar2)) == cVar2) {
                return false;
            }
            try {
                this.f18135f.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.d();
                }
            }
        }

        @Override // h.a.x.c
        public void d() {
            h.a.z.a.c.i(this);
        }

        public void e(h.a.x.c cVar) {
            h.a.z.a.c.B(this, cVar);
        }

        @Override // h.a.x.c
        public boolean f() {
            return h.a.z.a.c.n(get());
        }

        @Override // h.a.t
        public void onSuccess(T t) {
            h.a.x.c andSet;
            h.a.x.c cVar = get();
            h.a.z.a.c cVar2 = h.a.z.a.c.DISPOSED;
            if (cVar == cVar2 || (andSet = getAndSet(cVar2)) == cVar2) {
                return;
            }
            try {
                if (t == null) {
                    this.f18135f.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f18135f.onSuccess(t);
                }
                if (andSet != null) {
                    andSet.d();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.d();
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C0256a.class.getSimpleName(), super.toString());
        }
    }

    public a(v<T> vVar) {
        this.a = vVar;
    }

    @Override // h.a.s
    protected void h(u<? super T> uVar) {
        C0256a c0256a = new C0256a(uVar);
        uVar.b(c0256a);
        try {
            this.a.a(c0256a);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            c0256a.a(th);
        }
    }
}
