package h.a.z.e.d;

import h.a.z.e.d.p;

/* compiled from: ObservableJust.java */
/* loaded from: classes2.dex */
public final class m<T> extends h.a.m<T> implements h.a.z.c.d<T> {

    /* renamed from: f, reason: collision with root package name */
    private final T f18099f;

    public m(T t) {
        this.f18099f = t;
    }

    @Override // h.a.z.c.d, java.util.concurrent.Callable
    public T call() {
        return this.f18099f;
    }

    @Override // h.a.m
    protected void x(h.a.q<? super T> qVar) {
        p.a aVar = new p.a(qVar, this.f18099f);
        qVar.b(aVar);
        aVar.run();
    }
}
