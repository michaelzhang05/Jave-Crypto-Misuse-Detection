package h.a.z.e.b;

import h.a.h;
import h.a.i;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureDrop.java */
/* loaded from: classes2.dex */
public final class d<T> extends h.a.z.e.b.a<T, T> implements h.a.y.e<T> {

    /* renamed from: c, reason: collision with root package name */
    final h.a.y.e<? super T> f18013c;

    /* compiled from: FlowableOnBackpressureDrop.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicLong implements i<T>, k.a.c {

        /* renamed from: f, reason: collision with root package name */
        final k.a.b<? super T> f18014f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.y.e<? super T> f18015g;

        /* renamed from: h, reason: collision with root package name */
        k.a.c f18016h;

        /* renamed from: i, reason: collision with root package name */
        boolean f18017i;

        a(k.a.b<? super T> bVar, h.a.y.e<? super T> eVar) {
            this.f18014f = bVar;
            this.f18015g = eVar;
        }

        @Override // k.a.b
        public void a() {
            if (this.f18017i) {
                return;
            }
            this.f18017i = true;
            this.f18014f.a();
        }

        @Override // k.a.b
        public void b(k.a.c cVar) {
            if (h.a.z.i.b.B(this.f18016h, cVar)) {
                this.f18016h = cVar;
                this.f18014f.b(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // k.a.c
        public void cancel() {
            this.f18016h.cancel();
        }

        @Override // k.a.b
        public void onError(Throwable th) {
            if (this.f18017i) {
                h.a.a0.a.o(th);
            } else {
                this.f18017i = true;
                this.f18014f.onError(th);
            }
        }

        @Override // k.a.b
        public void onNext(T t) {
            if (this.f18017i) {
                return;
            }
            if (get() != 0) {
                this.f18014f.onNext(t);
                h.a.z.j.b.c(this, 1L);
                return;
            }
            try {
                this.f18015g.a(t);
            } catch (Throwable th) {
                io.reactivex.exceptions.a.a(th);
                cancel();
                onError(th);
            }
        }

        @Override // k.a.c
        public void request(long j2) {
            if (h.a.z.i.b.r(j2)) {
                h.a.z.j.b.a(this, j2);
            }
        }
    }

    public d(h<T> hVar) {
        super(hVar);
        this.f18013c = this;
    }

    @Override // h.a.y.e
    public void a(T t) {
    }

    @Override // h.a.h
    protected void i(k.a.b<? super T> bVar) {
        this.f17999b.h(new a(bVar, this.f18013c));
    }
}
