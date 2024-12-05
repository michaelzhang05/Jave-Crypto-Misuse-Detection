package rx.n.a;

import rx.e;

/* compiled from: OnSubscribeThrow.java */
/* loaded from: classes3.dex */
public final class d0<T> implements e.a<T> {

    /* renamed from: f, reason: collision with root package name */
    private final Throwable f22533f;

    public d0(Throwable th) {
        this.f22533f = th;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super T> jVar) {
        jVar.onError(this.f22533f);
    }
}
