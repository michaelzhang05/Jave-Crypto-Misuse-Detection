package h.a.z.e.e;

import h.a.s;
import h.a.u;
import h.a.w;

/* compiled from: SingleMap.java */
/* loaded from: classes2.dex */
public final class d<T, R> extends s<R> {
    final w<? extends T> a;

    /* renamed from: b, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends R> f18141b;

    /* compiled from: SingleMap.java */
    /* loaded from: classes2.dex */
    static final class a<T, R> implements u<T> {

        /* renamed from: f, reason: collision with root package name */
        final u<? super R> f18142f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends R> f18143g;

        a(u<? super R> uVar, h.a.y.f<? super T, ? extends R> fVar) {
            this.f18142f = uVar;
            this.f18143g = fVar;
        }

        @Override // h.a.u
        public void b(h.a.x.c cVar) {
            this.f18142f.b(cVar);
        }

        @Override // h.a.u
        public void onError(Throwable th) {
            this.f18142f.onError(th);
        }

        @Override // h.a.u
        public void onSuccess(T t) {
            try {
                this.f18142f.onSuccess(h.a.z.b.b.c(this.f18143g.a(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                onError(th);
            }
        }
    }

    public d(w<? extends T> wVar, h.a.y.f<? super T, ? extends R> fVar) {
        this.a = wVar;
        this.f18141b = fVar;
    }

    @Override // h.a.s
    protected void h(u<? super R> uVar) {
        this.a.b(new a(uVar, this.f18141b));
    }
}
