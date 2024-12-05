package h.a.z.e.c;

import h.a.j;
import h.a.k;
import h.a.x.d;
import java.util.concurrent.Callable;

/* compiled from: MaybeFromCallable.java */
/* loaded from: classes2.dex */
public final class b<T> extends j<T> implements Callable<T> {

    /* renamed from: f, reason: collision with root package name */
    final Callable<? extends T> f18028f;

    public b(Callable<? extends T> callable) {
        this.f18028f = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        return this.f18028f.call();
    }

    @Override // h.a.j
    protected void e(k<? super T> kVar) {
        h.a.x.c b2 = d.b();
        kVar.b(b2);
        if (b2.f()) {
            return;
        }
        try {
            T call = this.f18028f.call();
            if (b2.f()) {
                return;
            }
            if (call == null) {
                kVar.a();
            } else {
                kVar.onSuccess(call);
            }
        } catch (Throwable th) {
            io.reactivex.exceptions.a.a(th);
            if (!b2.f()) {
                kVar.onError(th);
            } else {
                h.a.a0.a.o(th);
            }
        }
    }
}
