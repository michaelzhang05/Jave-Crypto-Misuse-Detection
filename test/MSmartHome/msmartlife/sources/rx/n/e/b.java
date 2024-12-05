package rx.n.e;

/* compiled from: ActionSubscriber.java */
/* loaded from: classes3.dex */
public final class b<T> extends rx.j<T> {

    /* renamed from: f, reason: collision with root package name */
    final rx.m.b<? super T> f23091f;

    /* renamed from: g, reason: collision with root package name */
    final rx.m.b<Throwable> f23092g;

    /* renamed from: h, reason: collision with root package name */
    final rx.m.a f23093h;

    public b(rx.m.b<? super T> bVar, rx.m.b<Throwable> bVar2, rx.m.a aVar) {
        this.f23091f = bVar;
        this.f23092g = bVar2;
        this.f23093h = aVar;
    }

    @Override // rx.f
    public void onCompleted() {
        this.f23093h.call();
    }

    @Override // rx.f
    public void onError(Throwable th) {
        this.f23092g.call(th);
    }

    @Override // rx.f
    public void onNext(T t) {
        this.f23091f.call(t);
    }
}
