package h.a.z.e.b;

import h.a.h;
import h.a.i;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableOnBackpressureLatest.java */
/* loaded from: classes2.dex */
public final class f<T> extends h.a.z.e.b.a<T, T> {

    /* compiled from: FlowableOnBackpressureLatest.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends AtomicInteger implements i<T>, k.a.c {

        /* renamed from: f, reason: collision with root package name */
        final k.a.b<? super T> f18021f;

        /* renamed from: g, reason: collision with root package name */
        k.a.c f18022g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f18023h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f18024i;

        /* renamed from: j, reason: collision with root package name */
        volatile boolean f18025j;

        /* renamed from: k, reason: collision with root package name */
        final AtomicLong f18026k = new AtomicLong();
        final AtomicReference<T> l = new AtomicReference<>();

        a(k.a.b<? super T> bVar) {
            this.f18021f = bVar;
        }

        @Override // k.a.b
        public void a() {
            this.f18023h = true;
            d();
        }

        @Override // k.a.b
        public void b(k.a.c cVar) {
            if (h.a.z.i.b.B(this.f18022g, cVar)) {
                this.f18022g = cVar;
                this.f18021f.b(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        boolean c(boolean z, boolean z2, k.a.b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f18025j) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f18024i;
            if (th != null) {
                atomicReference.lazySet(null);
                bVar.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            bVar.a();
            return true;
        }

        @Override // k.a.c
        public void cancel() {
            if (this.f18025j) {
                return;
            }
            this.f18025j = true;
            this.f18022g.cancel();
            if (getAndIncrement() == 0) {
                this.l.lazySet(null);
            }
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            k.a.b<? super T> bVar = this.f18021f;
            AtomicLong atomicLong = this.f18026k;
            AtomicReference<T> atomicReference = this.l;
            int i2 = 1;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == atomicLong.get()) {
                        break;
                    }
                    boolean z = this.f18023h;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z2 = andSet == null;
                    if (c(z, z2, bVar, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    bVar.onNext(andSet);
                    j2++;
                }
                if (j2 == atomicLong.get()) {
                    if (c(this.f18023h, atomicReference.get() == null, bVar, atomicReference)) {
                        return;
                    }
                }
                if (j2 != 0) {
                    h.a.z.j.b.c(atomicLong, j2);
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // k.a.b
        public void onError(Throwable th) {
            this.f18024i = th;
            this.f18023h = true;
            d();
        }

        @Override // k.a.b
        public void onNext(T t) {
            this.l.lazySet(t);
            d();
        }

        @Override // k.a.c
        public void request(long j2) {
            if (h.a.z.i.b.r(j2)) {
                h.a.z.j.b.a(this.f18026k, j2);
                d();
            }
        }
    }

    public f(h<T> hVar) {
        super(hVar);
    }

    @Override // h.a.h
    protected void i(k.a.b<? super T> bVar) {
        this.f17999b.h(new a(bVar));
    }
}
