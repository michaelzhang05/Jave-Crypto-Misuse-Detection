package h.a.z.a;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CancellableDisposable.java */
/* loaded from: classes2.dex */
public final class a extends AtomicReference<h.a.y.d> implements h.a.x.c {
    public a(h.a.y.d dVar) {
        super(dVar);
    }

    @Override // h.a.x.c
    public void d() {
        h.a.y.d andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e2) {
            io.reactivex.exceptions.a.a(e2);
            h.a.a0.a.o(e2);
        }
    }

    @Override // h.a.x.c
    public boolean f() {
        return get() == null;
    }
}
