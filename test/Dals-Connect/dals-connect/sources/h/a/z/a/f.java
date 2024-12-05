package h.a.z.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequentialDisposable.java */
/* loaded from: classes2.dex */
public final class f extends AtomicReference<h.a.x.c> implements h.a.x.c {
    public f() {
    }

    public boolean a(h.a.x.c cVar) {
        return c.o(this, cVar);
    }

    @Override // h.a.x.c
    public void d() {
        c.i(this);
    }

    @Override // h.a.x.c
    public boolean f() {
        return c.n(get());
    }

    public f(h.a.x.c cVar) {
        lazySet(cVar);
    }
}
