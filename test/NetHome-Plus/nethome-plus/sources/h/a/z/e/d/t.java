package h.a.z.e.d;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ObservableUnsubscribeOn.java */
/* loaded from: classes2.dex */
public final class t<T> extends h.a.z.e.d.a<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.r f18130g;

    /* compiled from: ObservableUnsubscribeOn.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicBoolean implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18131f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.r f18132g;

        /* renamed from: h, reason: collision with root package name */
        h.a.x.c f18133h;

        /* compiled from: ObservableUnsubscribeOn.java */
        /* renamed from: h.a.z.e.d.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class RunnableC0255a implements Runnable {
            RunnableC0255a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f18133h.d();
            }
        }

        a(h.a.q<? super T> qVar, h.a.r rVar) {
            this.f18131f = qVar;
            this.f18132g = rVar;
        }

        @Override // h.a.q
        public void a() {
            if (get()) {
                return;
            }
            this.f18131f.a();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18133h, cVar)) {
                this.f18133h = cVar;
                this.f18131f.b(this);
            }
        }

        @Override // h.a.x.c
        public void d() {
            if (compareAndSet(false, true)) {
                this.f18132g.b(new RunnableC0255a());
            }
        }

        @Override // h.a.x.c
        public boolean f() {
            return get();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (get()) {
                h.a.a0.a.o(th);
            } else {
                this.f18131f.onError(th);
            }
        }

        @Override // h.a.q
        public void onNext(T t) {
            if (get()) {
                return;
            }
            this.f18131f.onNext(t);
        }
    }

    public t(h.a.p<T> pVar, h.a.r rVar) {
        super(pVar);
        this.f18130g = rVar;
    }

    @Override // h.a.m
    public void x(h.a.q<? super T> qVar) {
        this.f18030f.a(new a(qVar, this.f18130g));
    }
}
