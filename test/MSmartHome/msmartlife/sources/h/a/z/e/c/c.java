package h.a.z.e.c;

import h.a.j;
import h.a.k;
import h.a.z.c.d;

/* compiled from: MaybeJust.java */
/* loaded from: classes2.dex */
public final class c<T> extends j<T> implements d<T> {

    /* renamed from: f, reason: collision with root package name */
    final T f18029f;

    public c(T t) {
        this.f18029f = t;
    }

    @Override // h.a.z.c.d, java.util.concurrent.Callable
    public T call() {
        return this.f18029f;
    }

    @Override // h.a.j
    protected void e(k<? super T> kVar) {
        kVar.b(h.a.x.d.a());
        kVar.onSuccess(this.f18029f);
    }
}
