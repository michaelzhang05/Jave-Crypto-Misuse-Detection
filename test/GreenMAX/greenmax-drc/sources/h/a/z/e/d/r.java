package h.a.z.e.d;

import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: ObservableToList.java */
/* loaded from: classes2.dex */
public final class r<T, U extends Collection<? super T>> extends h.a.z.e.d.a<T, U> {

    /* renamed from: g, reason: collision with root package name */
    final Callable<U> f18122g;

    /* compiled from: ObservableToList.java */
    /* loaded from: classes2.dex */
    static final class a<T, U extends Collection<? super T>> implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super U> f18123f;

        /* renamed from: g, reason: collision with root package name */
        h.a.x.c f18124g;

        /* renamed from: h, reason: collision with root package name */
        U f18125h;

        a(h.a.q<? super U> qVar, U u) {
            this.f18123f = qVar;
            this.f18125h = u;
        }

        @Override // h.a.q
        public void a() {
            U u = this.f18125h;
            this.f18125h = null;
            this.f18123f.onNext(u);
            this.f18123f.a();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18124g, cVar)) {
                this.f18124g = cVar;
                this.f18123f.b(this);
            }
        }

        @Override // h.a.x.c
        public void d() {
            this.f18124g.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18124g.f();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            this.f18125h = null;
            this.f18123f.onError(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            this.f18125h.add(t);
        }
    }

    public r(h.a.p<T> pVar, Callable<U> callable) {
        super(pVar);
        this.f18122g = callable;
    }

    @Override // h.a.m
    public void x(h.a.q<? super U> qVar) {
        try {
            this.f18030f.a(new a(qVar, (Collection) h.a.z.b.b.c(this.f18122g.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            h.a.z.a.d.r(th, qVar);
        }
    }
}
