package rx.n.a;

import rx.e;

/* compiled from: OnSubscribeLift.java */
/* loaded from: classes3.dex */
public final class v<T, R> implements e.a<R> {

    /* renamed from: f, reason: collision with root package name */
    final e.a<T> f22879f;

    /* renamed from: g, reason: collision with root package name */
    final e.b<? extends R, ? super T> f22880g;

    public v(e.a<T> aVar, e.b<? extends R, ? super T> bVar) {
        this.f22879f = aVar;
        this.f22880g = bVar;
    }

    @Override // rx.m.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(rx.j<? super R> jVar) {
        try {
            rx.j<? super T> call = rx.q.c.n(this.f22880g).call(jVar);
            try {
                call.onStart();
                this.f22879f.call(call);
            } catch (Throwable th) {
                rx.exceptions.a.e(th);
                call.onError(th);
            }
        } catch (Throwable th2) {
            rx.exceptions.a.e(th2);
            jVar.onError(th2);
        }
    }
}
