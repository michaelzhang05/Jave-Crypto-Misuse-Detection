package rx.n.e;

/* compiled from: ActionObserver.java */
/* loaded from: classes3.dex */
public final class a<T> implements rx.f<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.b<? super T> f23088f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.b<? super Throwable> f23089g;

    /* renamed from: h, reason: collision with root package name */
    final rx.m.a f23090h;

    public a(rx.m.b<? super T> bVar, rx.m.b<? super Throwable> bVar2, rx.m.a aVar) {
        this.f23088f = bVar;
        this.f23089g = bVar2;
        this.f23090h = aVar;
    }

    @Override // rx.f
    public void onCompleted() {
        this.f23090h.call();
    }

    @Override // rx.f
    public void onError(Throwable th) {
        this.f23089g.call(th);
    }

    @Override // rx.f
    public void onNext(T t) {
        this.f23088f.call(t);
    }
}
