package h.a.z.e.b;

import h.a.h;
import h.a.i;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureError.java */
/* loaded from: classes2.dex */
public final class e<T> extends h.a.z.e.b.a<T, T> {

    /* compiled from: FlowableOnBackpressureError.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicLong implements i<T>, k.a.c {

        /* renamed from: f, reason: collision with root package name */
        final k.a.b<? super T> f18018f;

        /* renamed from: g, reason: collision with root package name */
        k.a.c f18019g;

        /* renamed from: h, reason: collision with root package name */
        boolean f18020h;

        a(k.a.b<? super T> bVar) {
            this.f18018f = bVar;
        }

        @Override // k.a.b
        public void a() {
            if (this.f18020h) {
                return;
            }
            this.f18020h = true;
            this.f18018f.a();
        }

        @Override // k.a.b
        public void b(k.a.c cVar) {
            if (h.a.z.i.b.B(this.f18019g, cVar)) {
                this.f18019g = cVar;
                this.f18018f.b(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // k.a.c
        public void cancel() {
            this.f18019g.cancel();
        }

        @Override // k.a.b
        public void onError(Throwable th) {
            if (this.f18020h) {
                h.a.a0.a.o(th);
            } else {
                this.f18020h = true;
                this.f18018f.onError(th);
            }
        }

        @Override // k.a.b
        public void onNext(T t) {
            if (this.f18020h) {
                return;
            }
            if (get() != 0) {
                this.f18018f.onNext(t);
                h.a.z.j.b.c(this, 1L);
            } else {
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // k.a.c
        public void request(long j2) {
            if (h.a.z.i.b.r(j2)) {
                h.a.z.j.b.a(this, j2);
            }
        }
    }

    public e(h<T> hVar) {
        super(hVar);
    }

    @Override // h.a.h
    protected void i(k.a.b<? super T> bVar) {
        this.f17999b.h(new a(bVar));
    }
}
