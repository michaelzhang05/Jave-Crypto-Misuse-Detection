package h.a.z.e.b;

import h.a.h;
import h.a.m;
import h.a.q;

/* compiled from: FlowableFromObservable.java */
/* loaded from: classes2.dex */
public final class b<T> extends h<T> {

    /* renamed from: b, reason: collision with root package name */
    private final m<T> f18000b;

    /* compiled from: FlowableFromObservable.java */
    /* loaded from: classes2.dex */
    static final class a<T> implements q<T>, k.a.c {

        /* renamed from: f, reason: collision with root package name */
        final k.a.b<? super T> f18001f;

        /* renamed from: g, reason: collision with root package name */
        h.a.x.c f18002g;

        a(k.a.b<? super T> bVar) {
            this.f18001f = bVar;
        }

        @Override // h.a.q
        public void a() {
            this.f18001f.a();
        }

        @Override // h.a.q
        public void b(h.a.x.c cVar) {
            this.f18002g = cVar;
            this.f18001f.b(this);
        }

        @Override // k.a.c
        public void cancel() {
            this.f18002g.d();
        }

        @Override // h.a.q
        public void onError(Throwable th) {
            this.f18001f.onError(th);
        }

        @Override // h.a.q
        public void onNext(T t) {
            this.f18001f.onNext(t);
        }

        @Override // k.a.c
        public void request(long j2) {
        }
    }

    public b(m<T> mVar) {
        this.f18000b = mVar;
    }

    @Override // h.a.h
    protected void i(k.a.b<? super T> bVar) {
        this.f18000b.a(new a(bVar));
    }
}
