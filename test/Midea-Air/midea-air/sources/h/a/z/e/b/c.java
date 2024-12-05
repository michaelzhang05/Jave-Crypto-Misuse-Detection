package h.a.z.e.b;

import h.a.h;
import h.a.i;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: FlowableOnBackpressureBuffer.java */
/* loaded from: classes2.dex */
public final class c<T> extends h.a.z.e.b.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final int f18003c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f18004d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f18005e;

    /* renamed from: f, reason: collision with root package name */
    final h.a.y.a f18006f;

    /* compiled from: FlowableOnBackpressureBuffer.java */
    /* loaded from: classes2.dex */
    static final class a<T> extends h.a.z.i.a<T> implements i<T> {

        /* renamed from: f, reason: collision with root package name */
        final k.a.b<? super T> f18007f;

        /* renamed from: g, reason: collision with root package name */
        final h.a.z.c.e<T> f18008g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f18009h;

        /* renamed from: i, reason: collision with root package name */
        final h.a.y.a f18010i;

        /* renamed from: j, reason: collision with root package name */
        k.a.c f18011j;

        /* renamed from: k, reason: collision with root package name */
        volatile boolean f18012k;
        volatile boolean l;
        Throwable m;
        final AtomicLong n = new AtomicLong();
        boolean o;

        a(k.a.b<? super T> bVar, int i2, boolean z, boolean z2, h.a.y.a aVar) {
            h.a.z.c.e<T> bVar2;
            this.f18007f = bVar;
            this.f18010i = aVar;
            this.f18009h = z2;
            if (z) {
                bVar2 = new h.a.z.f.c<>(i2);
            } else {
                bVar2 = new h.a.z.f.b<>(i2);
            }
            this.f18008g = bVar2;
        }

        @Override // k.a.b
        public void a() {
            this.l = true;
            if (this.o) {
                this.f18007f.a();
            } else {
                d();
            }
        }

        @Override // k.a.b
        public void b(k.a.c cVar) {
            if (h.a.z.i.b.B(this.f18011j, cVar)) {
                this.f18011j = cVar;
                this.f18007f.b(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        boolean c(boolean z, boolean z2, k.a.b<? super T> bVar) {
            if (this.f18012k) {
                this.f18008g.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.f18009h) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.m;
                if (th != null) {
                    bVar.onError(th);
                } else {
                    bVar.a();
                }
                return true;
            }
            Throwable th2 = this.m;
            if (th2 != null) {
                this.f18008g.clear();
                bVar.onError(th2);
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
            if (this.f18012k) {
                return;
            }
            this.f18012k = true;
            this.f18011j.cancel();
            if (this.o || getAndIncrement() != 0) {
                return;
            }
            this.f18008g.clear();
        }

        @Override // h.a.z.c.f
        public void clear() {
            this.f18008g.clear();
        }

        void d() {
            if (getAndIncrement() == 0) {
                h.a.z.c.e<T> eVar = this.f18008g;
                k.a.b<? super T> bVar = this.f18007f;
                int i2 = 1;
                while (!c(this.l, eVar.isEmpty(), bVar)) {
                    long j2 = this.n.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.l;
                        T poll = eVar.poll();
                        boolean z2 = poll == null;
                        if (c(z, z2, bVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        bVar.onNext(poll);
                        j3++;
                    }
                    if (j3 == j2 && c(this.l, eVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.n.addAndGet(-j3);
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // h.a.z.c.f
        public boolean isEmpty() {
            return this.f18008g.isEmpty();
        }

        @Override // k.a.b
        public void onError(Throwable th) {
            this.m = th;
            this.l = true;
            if (this.o) {
                this.f18007f.onError(th);
            } else {
                d();
            }
        }

        @Override // k.a.b
        public void onNext(T t) {
            if (!this.f18008g.offer(t)) {
                this.f18011j.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f18010i.run();
                } catch (Throwable th) {
                    io.reactivex.exceptions.a.a(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
                return;
            }
            if (this.o) {
                this.f18007f.onNext(null);
            } else {
                d();
            }
        }

        @Override // h.a.z.c.f
        public T poll() throws Exception {
            return this.f18008g.poll();
        }

        @Override // k.a.c
        public void request(long j2) {
            if (this.o || !h.a.z.i.b.r(j2)) {
                return;
            }
            h.a.z.j.b.a(this.n, j2);
            d();
        }
    }

    public c(h<T> hVar, int i2, boolean z, boolean z2, h.a.y.a aVar) {
        super(hVar);
        this.f18003c = i2;
        this.f18004d = z;
        this.f18005e = z2;
        this.f18006f = aVar;
    }

    @Override // h.a.h
    protected void i(k.a.b<? super T> bVar) {
        this.f17999b.h(new a(bVar, this.f18003c, this.f18004d, this.f18005e, this.f18006f));
    }
}
