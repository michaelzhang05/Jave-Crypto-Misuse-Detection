package h.a.z.e.d;

import h.a.u;
import java.util.Collection;
import java.util.concurrent.Callable;

/* compiled from: ObservableToListSingle.java */
/* loaded from: classes2.dex */
public final class s<T, U extends Collection<? super T>> extends h.a.s<U> implements h.a.z.c.a<U> {
    final h.a.p<T> a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f18126b;

    /* compiled from: ObservableToListSingle.java */
    /* loaded from: classes2.dex */
    static final class a<T, U extends Collection<? super T>> implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final u<? super U> f18127f;

        /* renamed from: g, reason: collision with root package name */
        U f18128g;

        /* renamed from: h, reason: collision with root package name */
        h.a.x.c f18129h;

        a(u<? super U> uVar, U u) {
            this.f18127f = uVar;
            this.f18128g = u;
        }

        @Override // h.a.q
        public void a() {
            U u = this.f18128g;
            this.f18128g = null;
            this.f18127f.onSuccess(u);
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18129h, cVar)) {
                this.f18129h = cVar;
                this.f18127f.b(this);
            }
        }

        @Override // h.a.x.c
        public void d() {
            this.f18129h.d();
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18129h.f();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            this.f18128g = null;
            this.f18127f.onError(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            this.f18128g.add(t);
        }
    }

    public s(h.a.p<T> pVar, int i2) {
        this.a = pVar;
        this.f18126b = h.a.z.b.a.a(i2);
    }

    @Override // h.a.z.c.a
    public h.a.m<U> a() {
        return h.a.a0.a.m(new r(this.a, this.f18126b));
    }

    @Override // h.a.s
    public void h(u<? super U> uVar) {
        try {
            this.a.a(new a(uVar, (Collection) h.a.z.b.b.c(this.f18126b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            h.a.z.a.d.B(th, uVar);
        }
    }
}
