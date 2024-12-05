package rx.n.a;

/* compiled from: SingleLiftObservableOperator.java */
/* loaded from: classes3.dex */
final class l1<T> extends rx.i<T> {

    /* renamed from: g, reason: collision with root package name */
    final rx.j<? super T> f22695g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(rx.j<? super T> jVar) {
        this.f22695g = jVar;
    }

    @Override // rx.i
    public void c(T t) {
        this.f22695g.setProducer(new rx.n.b.c(this.f22695g, t));
    }

    @Override // rx.i
    public void onError(Throwable th) {
        this.f22695g.onError(th);
    }
}
