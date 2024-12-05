package h.a.z.e.d;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapCompletable.java */
/* loaded from: classes2.dex */
public final class g<T> extends h.a.z.e.d.a<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends h.a.f> f18060g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f18061h;

    /* compiled from: ObservableFlatMapCompletable.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends h.a.z.d.a<T> implements h.a.q<T> {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18062f;

        /* renamed from: h, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends h.a.f> f18064h;

        /* renamed from: i, reason: collision with root package name */
        final boolean f18065i;

        /* renamed from: k, reason: collision with root package name */
        h.a.x.c f18067k;
        volatile boolean l;

        /* renamed from: g, reason: collision with root package name */
        final h.a.z.j.a f18063g = new h.a.z.j.a();

        /* renamed from: j, reason: collision with root package name */
        final h.a.x.b f18066j = new h.a.x.b();

        /* compiled from: ObservableFlatMapCompletable.java */
        /* renamed from: h.a.z.e.d.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C0252a extends AtomicReference<h.a.x.c> implements h.a.d, h.a.x.c {
            C0252a() {
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

        a(h.a.q<? super T> qVar, h.a.y.f<? super T, ? extends h.a.f> fVar, boolean z) {
            this.f18062f = qVar;
            this.f18064h = fVar;
            this.f18065i = z;
            lazySet(1);
        }

        @Override // h.a.q
        public void a() {
            if (decrementAndGet() == 0) {
                Throwable b2 = this.f18063g.b();
                if (b2 != null) {
                    this.f18062f.onError(b2);
                } else {
                    this.f18062f.a();
                }
            }
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18067k, cVar)) {
                this.f18067k = cVar;
                this.f18062f.b(this);
            }
        }

        void c(a<T>.C0252a c0252a) {
            this.f18066j.c(c0252a);
            a();
        }

        @Override // h.a.z.c.f
        public void clear() {
        }

        @Override // h.a.x.c
        public void d() {
            this.l = true;
            this.f18067k.d();
            this.f18066j.d();
        }

        void e(a<T>.C0252a c0252a, Throwable th) {
            this.f18066j.c(c0252a);
            onError(th);
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18067k.f();
        }

        @Override // h.a.z.c.c
        public int i(int i2) {
            return i2 & 2;
        }

        @Override // h.a.z.c.f
        public boolean isEmpty() {
            return true;
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (this.f18063g.a(th)) {
                if (this.f18065i) {
                    if (decrementAndGet() == 0) {
                        this.f18062f.onError(this.f18063g.b());
                        return;
                    }
                    return;
                }
                d();
                if (getAndSet(0) > 0) {
                    this.f18062f.onError(this.f18063g.b());
                    return;
                }
                return;
            }
            h.a.a0.a.o(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            try {
                h.a.f fVar = (h.a.f) h.a.z.b.b.c(this.f18064h.a(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0252a c0252a = new C0252a();
                if (this.l || !this.f18066j.b(c0252a)) {
                    return;
                }
                fVar.b(c0252a);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.f18067k.d();
                onError(th);
            }
        }

        @Override // h.a.z.c.f
        public T poll() throws Exception {
            return null;
        }
    }

    public g(h.a.p<T> pVar, h.a.y.f<? super T, ? extends h.a.f> fVar, boolean z) {
        super(pVar);
        this.f18060g = fVar;
        this.f18061h = z;
    }

    @Override // h.a.m
    protected void x(h.a.q<? super T> qVar) {
        this.f18030f.a(new a(qVar, this.f18060g, this.f18061h));
    }
}
