package h.a.z.e.d;

import android.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ObservableFlatMapMaybe.java */
/* loaded from: classes2.dex */
public final class i<T, R> extends h.a.z.e.d.a<T, R> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends h.a.l<? extends R>> f18078g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f18079h;

    /* compiled from: ObservableFlatMapMaybe.java */
    /* loaded from: classes2.dex */
    static final class a<T, R> extends AtomicInteger implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super R> f18080f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f18081g;

        /* renamed from: k, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends h.a.l<? extends R>> f18085k;
        h.a.x.c m;
        volatile boolean n;

        /* renamed from: h, reason: collision with root package name */
        final h.a.x.b f18082h = new h.a.x.b();

        /* renamed from: j, reason: collision with root package name */
        final h.a.z.j.a f18084j = new h.a.z.j.a();

        /* renamed from: i, reason: collision with root package name */
        final AtomicInteger f18083i = new AtomicInteger(1);
        final AtomicReference<h.a.z.f.c<R>> l = new AtomicReference<>();

        /* compiled from: ObservableFlatMapMaybe.java */
        /* renamed from: h.a.z.e.d.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C0254a extends AtomicReference<h.a.x.c> implements h.a.k<R>, h.a.x.c {
            C0254a() {
            }

            @Override // h.a.k
            public void a() {
                a.this.i(this);
            }

            @Override // h.a.k
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

            @Override // h.a.k
            public void onError(Throwable th) {
                a.this.j(this, th);
            }

            @Override // h.a.k
            public void onSuccess(R r) {
                a.this.k(this, r);
            }
        }

        a(h.a.q<? super R> qVar, h.a.y.f<? super T, ? extends h.a.l<? extends R>> fVar, boolean z) {
            this.f18080f = qVar;
            this.f18085k = fVar;
            this.f18081g = z;
        }

        @Override // h.a.q
        public void a() {
            this.f18083i.decrementAndGet();
            e();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.m, cVar)) {
                this.m = cVar;
                this.f18080f.b(this);
            }
        }

        void c() {
            h.a.z.f.c<R> cVar = this.l.get();
            if (cVar != null) {
                cVar.clear();
            }
        }

        @Override // h.a.x.c
        public void d() {
            this.n = true;
            this.m.d();
            this.f18082h.d();
        }

        void e() {
            if (getAndIncrement() == 0) {
                g();
            }
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.n;
        }

        void g() {
            h.a.q<? super R> qVar = this.f18080f;
            AtomicInteger atomicInteger = this.f18083i;
            AtomicReference<h.a.z.f.c<R>> atomicReference = this.l;
            int i2 = 1;
            while (!this.n) {
                if (!this.f18081g && this.f18084j.get() != null) {
                    Throwable b2 = this.f18084j.b();
                    c();
                    qVar.onError(b2);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                h.a.z.f.c<R> cVar = atomicReference.get();
                R.bool poll = cVar != null ? cVar.poll() : null;
                boolean z2 = poll == null;
                if (z && z2) {
                    Throwable b3 = this.f18084j.b();
                    if (b3 != null) {
                        qVar.onError(b3);
                        return;
                    } else {
                        qVar.a();
                        return;
                    }
                }
                if (z2) {
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                } else {
                    qVar.onNext(poll);
                }
            }
            c();
        }

        h.a.z.f.c<R> h() {
            h.a.z.f.c<R> cVar;
            do {
                h.a.z.f.c<R> cVar2 = this.l.get();
                if (cVar2 != null) {
                    return cVar2;
                }
                cVar = new h.a.z.f.c<>(h.a.m.b());
            } while (!this.l.compareAndSet(null, cVar));
            return cVar;
        }

        void i(a<T, R>.C0254a c0254a) {
            this.f18082h.c(c0254a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z = this.f18083i.decrementAndGet() == 0;
                    h.a.z.f.c<R> cVar = this.l.get();
                    if (z && (cVar == null || cVar.isEmpty())) {
                        Throwable b2 = this.f18084j.b();
                        if (b2 != null) {
                            this.f18080f.onError(b2);
                            return;
                        } else {
                            this.f18080f.a();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    g();
                    return;
                }
            }
            this.f18083i.decrementAndGet();
            e();
        }

        void j(a<T, R>.C0254a c0254a, Throwable th) {
            this.f18082h.c(c0254a);
            if (this.f18084j.a(th)) {
                if (!this.f18081g) {
                    this.m.d();
                    this.f18082h.d();
                }
                this.f18083i.decrementAndGet();
                e();
                return;
            }
            h.a.a0.a.o(th);
        }

        void k(a<T, R>.C0254a c0254a, R r) {
            this.f18082h.c(c0254a);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    this.f18080f.onNext(r);
                    boolean z = this.f18083i.decrementAndGet() == 0;
                    h.a.z.f.c<R> cVar = this.l.get();
                    if (z && (cVar == null || cVar.isEmpty())) {
                        Throwable b2 = this.f18084j.b();
                        if (b2 != null) {
                            this.f18080f.onError(b2);
                            return;
                        } else {
                            this.f18080f.a();
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    g();
                }
            }
            h.a.z.f.c<R> h2 = h();
            synchronized (h2) {
                h2.offer(r);
            }
            this.f18083i.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            g();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            this.f18083i.decrementAndGet();
            if (this.f18084j.a(th)) {
                if (!this.f18081g) {
                    this.f18082h.d();
                }
                e();
                return;
            }
            h.a.a0.a.o(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            try {
                h.a.l lVar = (h.a.l) h.a.z.b.b.c(this.f18085k.a(t), "The mapper returned a null MaybeSource");
                this.f18083i.getAndIncrement();
                C0254a c0254a = new C0254a();
                if (this.n || !this.f18082h.b(c0254a)) {
                    return;
                }
                lVar.a(c0254a);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.m.d();
                onError(th);
            }
        }
    }

    public i(h.a.p<T> pVar, h.a.y.f<? super T, ? extends h.a.l<? extends R>> fVar, boolean z) {
        super(pVar);
        this.f18078g = fVar;
        this.f18079h = z;
    }

    @Override // h.a.m
    protected void x(h.a.q<? super R> qVar) {
        this.f18030f.a(new a(qVar, this.f18078g, this.f18079h));
    }
}
