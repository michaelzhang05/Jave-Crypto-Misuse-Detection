package h.a.z.e.d;

import java.util.Iterator;

/* compiled from: ObservableFlattenIterable.java */
/* loaded from: classes2.dex */
public final class j<T, R> extends h.a.z.e.d.a<T, R> {

    /* renamed from: g, reason: collision with root package name */
    final h.a.y.f<? super T, ? extends Iterable<? extends R>> f18087g;

    /* compiled from: ObservableFlattenIterable.java */
    /* loaded from: classes2.dex */
    static final class a<T, R> implements h.a.q<T>, h.a.x.c {

        /* renamed from: f, reason: collision with root package name */
        final h.a.q<? super R> f18088f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.f<? super T, ? extends Iterable<? extends R>> f18089g;

        /* renamed from: h, reason: collision with root package name */
        h.a.x.c f18090h;

        a(h.a.q<? super R> qVar, h.a.y.f<? super T, ? extends Iterable<? extends R>> fVar) {
            this.f18088f = qVar;
            this.f18089g = fVar;
        }

        @Override // h.a.q
        public void a() {
            h.a.x.c cVar = this.f18090h;
            h.a.z.a.c cVar2 = h.a.z.a.c.DISPOSED;
            if (cVar == cVar2) {
                return;
            }
            this.f18090h = cVar2;
            this.f18088f.a();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            if (h.a.z.a.c.D(this.f18090h, cVar)) {
                this.f18090h = cVar;
                this.f18088f.b(this);
            }
        }

        @Override // h.a.x.c
        public void d() {
            this.f18090h.d();
            this.f18090h = h.a.z.a.c.DISPOSED;
        }

        @Override // h.a.x.c
        public boolean f() {
            return this.f18090h.f();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            h.a.x.c cVar = this.f18090h;
            h.a.z.a.c cVar2 = h.a.z.a.c.DISPOSED;
            if (cVar == cVar2) {
                h.a.a0.a.o(th);
            } else {
                this.f18090h = cVar2;
                this.f18088f.onError(th);
            }
        }

        @Override // h.a.q
        public void onNext(T t) {
            if (this.f18090h == h.a.z.a.c.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f18089g.a(t).iterator();
                h.a.q<? super R> qVar = this.f18088f;
                while (it.hasNext()) {
                    try {
                        try {
                            qVar.onNext((Object) h.a.z.b.b.c(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th) {
                            io.reactivex.exceptions.a.a(th);
                            this.f18090h.d();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        io.reactivex.exceptions.a.a(th2);
                        this.f18090h.d();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.a(th3);
                this.f18090h.d();
                onError(th3);
            }
        }
    }

    public j(h.a.p<T> pVar, h.a.y.f<? super T, ? extends Iterable<? extends R>> fVar) {
        super(pVar);
        this.f18087g = fVar;
    }

    @Override // h.a.m
    protected void x(h.a.q<? super R> qVar) {
        this.f18030f.a(new a(qVar, this.f18087g));
    }
}
