package rx.n.a;

import rx.e;

/* compiled from: OperatorDoOnSubscribe.java */
/* loaded from: classes3.dex */
public class n0<T> implements e.b<T, T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.m.a f22719f;

    public n0(rx.m.a aVar) {
        this.f22719f = aVar;
    }

    @Override // rx.m.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rx.j<? super T> call(rx.j<? super T> jVar) {
        this.f22719f.call();
        return rx.p.f.c(jVar);
    }
}
