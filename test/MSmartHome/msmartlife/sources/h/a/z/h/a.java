package h.a.z.h;

import h.a.i;
import h.a.z.j.d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import k.a.b;
import k.a.c;

/* compiled from: StrictSubscriber.java */
/* loaded from: classes2.dex */
public class a<T> extends AtomicInteger implements i<T>, c {

    /* renamed from: f, reason: collision with root package name */
    final b<? super T> f18258f;

    /* renamed from: g, reason: collision with root package name */
    final h.a.z.j.a f18259g = new h.a.z.j.a();

    /* renamed from: h, reason: collision with root package name */
    final AtomicLong f18260h = new AtomicLong();

    /* renamed from: i, reason: collision with root package name */
    final AtomicReference<c> f18261i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    final AtomicBoolean f18262j = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f18263k;

    public a(b<? super T> bVar) {
        this.f18258f = bVar;
    }

    @Override // k.a.b
    public void a() {
        this.f18263k = true;
        d.a(this.f18258f, this, this.f18259g);
    }

    @Override // k.a.b
    public void b(c cVar) {
        if (this.f18262j.compareAndSet(false, true)) {
            this.f18258f.b(this);
            h.a.z.i.b.i(this.f18261i, this.f18260h, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // k.a.c
    public void cancel() {
        if (this.f18263k) {
            return;
        }
        h.a.z.i.b.d(this.f18261i);
    }

    @Override // k.a.b
    public void onError(Throwable th) {
        this.f18263k = true;
        d.b(this.f18258f, th, this, this.f18259g);
    }

    @Override // k.a.b
    public void onNext(T t) {
        d.c(this.f18258f, t, this, this.f18259g);
    }

    @Override // k.a.c
    public void request(long j2) {
        if (j2 <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j2));
            return;
        }
        h.a.z.i.b.f(this.f18261i, this.f18260h, j2);
    }
}
