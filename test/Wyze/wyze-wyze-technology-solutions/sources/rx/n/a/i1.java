package rx.n.a;

import rx.Single;

/* compiled from: SingleDoOnSubscribe.java */
/* loaded from: classes3.dex */
public final class i1<T> implements Single.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final Single.j<T> f22625f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.a f22626g;

    public i1(Single.j<T> jVar, rx.m.a aVar) {
        this.f22625f = jVar;
        this.f22626g = aVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.i<? super T> iVar) {
        try {
            this.f22626g.call();
            this.f22625f.call(iVar);
        } catch (Throwable th) {
            rx.exceptions.a.e(th);
            iVar.onError(th);
        }
    }
}
