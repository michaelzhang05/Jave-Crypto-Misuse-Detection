package h.a.z.e.d;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletableCompletable.java */
/* loaded from: classes2.dex */
public final class h<T> extends h.a.b implements h.a.z.c.a<T> {
    final h.a.p<T> a;

    /* renamed from: b, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends h.a.f> f18069b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f18070c;

    /* compiled from: ObservableFlatMapCompletableCompletable.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicInteger implements h.a.x.c, h.a.q<T> {

        /* renamed from: f, reason: collision with root package name */
        final h.a.d f18071f;

        /* renamed from: h, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends h.a.f> f18073h;

        /* renamed from: i, reason: collision with root package name */
        final boolean f18074i;

        /* renamed from: k, reason: collision with root package name */
        h.a.x.c f18076k;
        volatile boolean l;

        /* renamed from: g, reason: collision with root package name */
        final h.a.z.j.a f18072g = new h.a.z.j.a();

        /* renamed from: j, reason: collision with root package name */
        final h.a.x.b f18075j = new h.a.x.b();

        /* compiled from: ObservableFlatMapCompletableCompletable.java */
        /* renamed from: h.a.z.e.d.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C0253a extends AtomicReference<h.a.x.c> implements h.a.d, h.a.x.c {
            C0253a() {
            }

            @Override // h.a.d
            public void a() {
                a.this.c(this);
            }

            @Override // h.a.d
            public void b(h.a.x.c cVar) {
                h.a.z.a.c.C(this, cVar);
            }

            @Override // h.a.x.c
            public void d() {
                h.a.z.a.c.i(this);
            }

            @Override // h.a.x.c
            public boolean f() {
                return h.a.z.a.c.n(get());
            }

            @Override // h.a.d
            public void onError(Throwable th) {
                a.this.e(this, th);
            }
        }

        a(h.a.d dVar, h.a.y.f<? super T, ? extends h.a.f> fVar, boolean z) {
            this.f18071f = dVar;
            this.f18073h = fVar;
            this.f18074i = z;
            lazySet(1);
        }

        @Override // h.a.q
        public void a() {
            if (decrementAndGet() == 0) {
                Throwable b2 = this.f18072g.b();
                if (b2 != null) {
                    this.f18071f.onError(b2);
                } else {
                    this.f18071f.a();
                }
            }
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18076k, cVar)) {
                this.f18076k = cVar;
                this.f18071f.b(this);
            }
        }

        void c(a<T>.C0253a c0253a) {
            this.f18075j.c(c0253a);
            a();
        }

        @Override // h.a.x.c
        public void d() {
            this.l = true;
            this.f18076k.d();
            this.f18075j.d();
        }

        void e(a<T>.C0253a c0253a, Throwable th) {
            this.f18075j.c(c0253a);
            onError(th);
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18076k.f();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (this.f18072g.a(th)) {
                if (this.f18074i) {
                    if (decrementAndGet() == 0) {
                        this.f18071f.onError(this.f18072g.b());
                        return;
                    }
                    return;
                }
                d();
                if (getAndSet(0) > 0) {
                    this.f18071f.onError(this.f18072g.b());
                    return;
                }
                return;
            }
            h.a.a0.a.o(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            try {
                h.a.f fVar = (h.a.f) h.a.z.b.b.c(this.f18073h.a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0253a c0253a = new C0253a();
                if (this.l || !this.f18075j.b(c0253a)) {
                    return;
                }
                fVar.b(c0253a);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.f18076k.d();
                onError(th);
            }
        }
    }

    public h(h.a.p<T> pVar, h.a.y.f<? super T, ? extends h.a.f> fVar, boolean z) {
        this.a = pVar;
        this.f18069b = fVar;
        this.f18070c = z;
    }

    @Override // h.a.z.c.a
    public h.a.m<T> a() {
        return h.a.a0.a.m(new g(this.a, this.f18069b, this.f18070c));
    }

    @Override // h.a.b
    protected void e(h.a.d dVar) {
        this.a.a(new a(dVar, this.f18069b, this.f18070c));
    }
}
