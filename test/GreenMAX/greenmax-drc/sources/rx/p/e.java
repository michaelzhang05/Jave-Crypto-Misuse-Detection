package rx.p;

import rx.j;

/* compiled from: SerializedSubscriber.java */
/* loaded from: classes3.dex */
public class e<T> extends j<T> {

    /* renamed from: f, reason: collision with root package name */
    private final rx.f<T> f23204f;

    public e(j<? super T> jVar) {
        this(jVar, true);
    }

    @Override // rx.f
    public void onCompleted() {
        this.f23204f.onCompleted();
    }

    @Override // rx.f
    public void onError(Throwable th) {
        this.f23204f.onError(th);
    }

    @Override // rx.f
    public void onNext(T t) {
        this.f23204f.onNext(t);
    }

    public e(j<? super T> jVar, boolean z) {
        super(jVar, z);
        this.f23204f = new d(jVar);
    }
}
