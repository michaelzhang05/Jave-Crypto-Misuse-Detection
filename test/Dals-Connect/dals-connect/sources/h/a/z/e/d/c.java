package h.a.z.e.d;

import io.reactivex.exceptions.CompositeException;

/* compiled from: ObservableDoOnEach.java */
/* loaded from: classes2.dex */
public final class c<T> extends h.a.z.e.d.a<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.y.e<? super T> f18033g;

    /* renamed from: h, reason: collision with root package name */
    final h.a.y.e<? super Throwable> f18034h;

    /* renamed from: i, reason: collision with root package name */
    final h.a.y.a f18035i;

    /* renamed from: j, reason: collision with root package name */
    final h.a.y.a f18036j;

    /* compiled from: ObservableDoOnEach.java */
    /* loaded from: classes2.dex */
    static final class a<T> implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18037f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.e<? super T> f18038g;

        /* renamed from: h, reason: collision with root package name */
        final h.a.y.e<? super Throwable> f18039h;

        /* renamed from: i, reason: collision with root package name */
        final h.a.y.a f18040i;

        /* renamed from: j, reason: collision with root package name */
        final h.a.y.a f18041j;

        /* renamed from: k, reason: collision with root package name */
        h.a.x.c f18042k;
        boolean l;

        a(h.a.q<? super T> qVar, h.a.y.e<? super T> eVar, h.a.y.e<? super Throwable> eVar2, h.a.y.a aVar, h.a.y.a aVar2) {
            this.f18037f = qVar;
            this.f18038g = eVar;
            this.f18039h = eVar2;
            this.f18040i = aVar;
            this.f18041j = aVar2;
        }

        @Override // h.a.q
        public void a() {
            if (this.l) {
                return;
            }
            try {
                this.f18040i.run();
                this.l = true;
                this.f18037f.a();
                try {
                    this.f18041j.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.a(th);
                    h.a.a0.a.o(th);
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.a(th2);
                onError(th2);
            }
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18042k, cVar)) {
                this.f18042k = cVar;
                this.f18037f.b(this);
            }
        }

        @Override // h.a.x.c
        public void d() {
            this.f18042k.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18042k.f();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            if (this.l) {
                h.a.a0.a.o(th);
                return;
            }
            this.l = true;
            try {
                this.f18039h.a(th);
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.a(th2);
                th = new CompositeException(th, th2);
            }
            this.f18037f.onError(th);
            try {
                this.f18041j.run();
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.a(th3);
                h.a.a0.a.o(th3);
            }
        }

        @Override // h.a.q
        public void onNext(T t) {
            if (this.l) {
                return;
            }
            try {
                this.f18038g.a(t);
                this.f18037f.onNext(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                this.f18042k.d();
                onError(th);
            }
        }
    }

    public c(h.a.p<T> pVar, h.a.y.e<? super T> eVar, h.a.y.e<? super Throwable> eVar2, h.a.y.a aVar, h.a.y.a aVar2) {
        super(pVar);
        this.f18033g = eVar;
        this.f18034h = eVar2;
        this.f18035i = aVar;
        this.f18036j = aVar2;
    }

    @Override // h.a.m
    public void x(h.a.q<? super T> qVar) {
        this.f18030f.a(new a(qVar, this.f18033g, this.f18034h, this.f18035i, this.f18036j));
    }
}
