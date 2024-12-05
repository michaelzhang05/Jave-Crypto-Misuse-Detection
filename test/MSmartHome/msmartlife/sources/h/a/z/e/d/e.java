package h.a.z.e.d;

import java.util.concurrent.Callable;

/* compiled from: ObservableError.java */
/* loaded from: classes2.dex */
public final class e<T> extends h.a.m<T> {

    /* renamed from: f, reason: collision with root package name */
    final Callable<? extends Throwable> f18044f;

    public e(Callable<? extends Throwable> callable) {
        this.f18044f = callable;
    }

    @Override // h.a.m
    public void x(h.a.q<? super T> qVar) {
        try {
            th = (Throwable) h.a.z.b.b.c(this.f18044f.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            io.reactivex.exceptions.a.a(th);
        }
        h.a.z.a.d.r(th, qVar);
    }
}
