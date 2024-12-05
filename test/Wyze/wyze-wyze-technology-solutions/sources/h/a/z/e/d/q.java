package h.a.z.e.d;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableSubscribeOn.java */
/* loaded from: classes2.dex */
public final class q<T> extends h.a.z.e.d.a<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.r f18117g;

    /* compiled from: ObservableSubscribeOn.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicReference<h.a.x.c> implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18118f;

        /* renamed from: g, reason: collision with root package name */
        final AtomicReference<h.a.x.c> f18119g = new AtomicReference<>();

        a(h.a.q<? super T> qVar) {
            this.f18118f = qVar;
        }

        @Override // h.a.q
        public void a() {
            this.f18118f.a();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            h.a.z.a.c.C(this.f18119g, cVar);
        }

        void c(h.a.x.c cVar) {
            h.a.z.a.c.C(this, cVar);
        }

        @Override // h.a.x.c
        public void d() {
            h.a.z.a.c.i(this.f18119g);
            h.a.z.a.c.i(this);
        }

        @Override // h.a.x.c
        public boolean f() {
            return h.a.z.a.c.n(get());
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            this.f18118f.onError(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            this.f18118f.onNext(t);
        }
    }

    /* compiled from: ObservableSubscribeOn.java */
    /* loaded from: classes2.dex */
    final class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final a<T> f18120f;

        b(a<T> aVar) {
            this.f18120f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.f18030f.a(this.f18120f);
        }
    }

    public q(h.a.p<T> pVar, h.a.r rVar) {
        super(pVar);
        this.f18117g = rVar;
    }

    @Override // h.a.m
    public void x(h.a.q<? super T> qVar) {
        a aVar = new a(qVar);
        qVar.b(aVar);
        aVar.c(this.f18117g.b(new b(aVar)));
    }
}
