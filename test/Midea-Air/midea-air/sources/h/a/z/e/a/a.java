package h.a.z.e.a;

import h.a.e;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CompletableCreate.java */
/* loaded from: classes2.dex */
public final class a extends h.a.b {
    final e a;

    /* compiled from: CompletableCreate.java */
    /* renamed from: h.a.z.e.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0251a extends AtomicReference<h.a.x.c> implements h.a.c, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.d f17993f;

        C0251a(h.a.d dVar) {
            this.f17993f = dVar;
        }

        @Override // h.a.c
        public void a() {
            h.a.x.c andSet;
            h.a.x.c cVar = get();
            h.a.z.a.c cVar2 = h.a.z.a.c.DISPOSED;
            if (cVar == cVar2 || (andSet = getAndSet(cVar2)) == cVar2) {
                return;
            }
            try {
                this.f17993f.a();
            } finally {
                if (andSet != null) {
                    andSet.d();
                }
            }
        }

        @Override // h.a.c
        public void b(h.a.y.d dVar) {
            e(new h.a.z.a.a(dVar));
        }

        @Override // h.a.c
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
                this.f17993f.onError(th);
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

        @Override // h.a.c
        public void onError(Throwable th) {
            if (c(th)) {
                return;
            }
            h.a.a0.a.o(th);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C0251a.class.getSimpleName(), super.toString());
        }
    }

    public a(e eVar) {
        this.a = eVar;
    }

    @Override // h.a.b
    protected void e(h.a.d dVar) {
        C0251a c0251a = new C0251a(dVar);
        dVar.b(c0251a);
        try {
            this.a.a(c0251a);
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            c0251a.onError(th);
        }
    }
}
