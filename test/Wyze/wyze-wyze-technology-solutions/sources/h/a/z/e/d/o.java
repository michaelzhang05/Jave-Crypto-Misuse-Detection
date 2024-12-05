package h.a.z.e.d;

import io.reactivex.exceptions.CompositeException;

/* compiled from: ObservableOnErrorReturn.java */
/* loaded from: classes2.dex */
public final class o<T> extends h.a.z.e.d.a<T, T> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.y.f<? super Throwable, ? extends T> f18109g;

    /* compiled from: ObservableOnErrorReturn.java */
    /* loaded from: classes2.dex */
    static final class a<T> implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super T> f18110f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.f<? super Throwable, ? extends T> f18111g;

        /* renamed from: h, reason: collision with root package name */
        h.a.x.c f18112h;

        a(h.a.q<? super T> qVar, h.a.y.f<? super Throwable, ? extends T> fVar) {
            this.f18110f = qVar;
            this.f18111g = fVar;
        }

        @Override // h.a.q
        public void a() {
            this.f18110f.a();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18112h, cVar)) {
                this.f18112h = cVar;
                this.f18110f.b(this);
            }
        }

        @Override // h.a.x.c
        public void d() {
            this.f18112h.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18112h.f();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            try {
                T a = this.f18111g.a(th);
                if (a == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f18110f.onError(nullPointerException);
                } else {
                    this.f18110f.onNext(a);
                    this.f18110f.a();
                }
            } catch (Throwable th2) {
                io.reactivex.exceptions.a.a(th2);
                this.f18110f.onError(new CompositeException(th, th2));
            }
        }

        @Override // h.a.q
        public void onNext(T t) {
            this.f18110f.onNext(t);
        }
    }

    public o(h.a.p<T> pVar, h.a.y.f<? super Throwable, ? extends T> fVar) {
        super(pVar);
        this.f18109g = fVar;
    }

    @Override // h.a.m
    public void x(h.a.q<? super T> qVar) {
        this.f18030f.a(new a(qVar, this.f18109g));
    }
}
