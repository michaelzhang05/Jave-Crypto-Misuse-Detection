package rx.n.a;

import rx.e;

/* compiled from: OnSubscribeDefer.java */
/* loaded from: classes3.dex */
public final class l<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.d<? extends rx.e<? extends T>> f22682f;

    public l(rx.m.d<? extends rx.e<? extends T>> dVar) {
        this.f22682f = dVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        try {
            this.f22682f.call().c1(rx.p.f.c(jVar));
        } catch (Throwable th) {
            rx.exceptions.a.f(th, jVar);
        }
    }
}
