package h.a.z.d;

import h.a.q;

/* compiled from: DeferredScalarDisposable.java */
/* loaded from: classes2.dex */
public class c<T> extends a<T> {

    /* renamed from: f, reason: collision with root package name */
    protected final q<? super T> f17991f;

    /* renamed from: g, reason: collision with root package name */
    protected T f17992g;

    public c(q<? super T> qVar) {
        this.f17991f = qVar;
    }

    public final void c(T t) {
        int i2 = get();
        if ((i2 & 54) != 0) {
            return;
        }
        q<? super T> qVar = this.f17991f;
        if (i2 == 8) {
            this.f17992g = t;
            lazySet(16);
            qVar.onNext(null);
        } else {
            lazySet(2);
            qVar.onNext(t);
        }
        if (get() != 4) {
            qVar.a();
        }
    }

    @Override // h.a.z.c.f
    public final void clear() {
        lazySet(32);
        this.f17992g = null;
    }

    @Override // h.a.x.c
    public void d() {
        set(4);
        this.f17992g = null;
    }

    public final void e(Throwable th) {
        if ((get() & 54) != 0) {
            h.a.a0.a.o(th);
        } else {
            lazySet(2);
            this.f17991f.onError(th);
        }
    }

    @Override // h.a.x.c
    public final boolean f() {
        return get() == 4;
    }

    @Override // h.a.z.c.c
    public final int i(int i2) {
        if ((i2 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // h.a.z.c.f
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // h.a.z.c.f
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f17992g;
        this.f17992g = null;
        lazySet(32);
        return t;
    }
}
