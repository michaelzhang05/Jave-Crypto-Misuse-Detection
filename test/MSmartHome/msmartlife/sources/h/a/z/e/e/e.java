package h.a.z.e.e;

import h.a.r;
import h.a.s;
import h.a.u;
import h.a.w;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleSubscribeOn.java */
/* loaded from: classes2.dex */
public final class e<T> extends s<T> {
    final w<? extends T> a;

    /* renamed from: b, reason: collision with root package name */
    final r f18144b;

    /* compiled from: SingleSubscribeOn.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicReference<h.a.x.c> implements u<T>, h.a.x.c, Runnable {

        /* renamed from: f, reason: collision with root package name */
        final u<? super T> f18145f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.z.a.f f18146g = new h.a.z.a.f();

        /* renamed from: h, reason: collision with root package name */
        final w<? extends T> f18147h;

        a(u<? super T> uVar, w<? extends T> wVar) {
            this.f18145f = uVar;
            this.f18147h = wVar;
        }

        @Override // h.a.u
        public void b(h.a.x.c cVar) {
            h.a.z.a.c.C(this, cVar);
        }

        @Override // h.a.x.c
        public void d() {
            h.a.z.a.c.i(this);
            this.f18146g.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return h.a.z.a.c.n(get());
        }

        @Override // h.a.u
        public void onError(Throwable th) {
            this.f18145f.onError(th);
        }

        @Override // h.a.u
        public void onSuccess(T t) {
            this.f18145f.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18147h.b(this);
        }
    }

    public e(w<? extends T> wVar, r rVar) {
        this.a = wVar;
        this.f18144b = rVar;
    }

    @Override // h.a.s
    protected void h(u<? super T> uVar) {
        a aVar = new a(uVar, this.a);
        uVar.b(aVar);
        aVar.f18146g.a(this.f18144b.b(aVar));
    }
}
